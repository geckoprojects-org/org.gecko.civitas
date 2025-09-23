pipeline  {
    agent any

    tools {
        jdk 'OpenJDK17'
    }
    options {
        buildDiscarder(logRotator(numToKeepStr: '5'))
    }

    stages {
        stage('Main branch release') {
            when { 
                branch 'main' 
            }
            steps {
                script {
                    echo "I am building on ${env.BRANCH_NAME}"
                    try {
                        sh "./gradlew clean build release -Drelease.dir=$JENKINS_HOME/repo.gecko/release/org.gecko.civitas --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
                    } finally {
                        junit testResults: '**/generated/test-reports/**/TEST-*.xml', allowEmptyResults: true, skipPublishingChecks: true
                    }
                }
            }
        }
        stage('Snapshot branch release') {
            when { 
                branch 'snapshot'
            }
            steps  {
                script {
                    echo "I am building on ${env.JOB_NAME}"
                    try {
                        sh "./gradlew clean release --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
                        sh "mkdir -p $JENKINS_HOME/repo.gecko/snapshot/org.gecko.civitas"
                        sh "rm -rf $JENKINS_HOME/repo.gecko/snapshot/org.gecko.civitas/*"
                        sh "cp -r cnf/release/* $JENKINS_HOME/repo.gecko/snapshot/org.gecko.civitas"
                    } finally {
                        junit testResults: '**/generated/test-reports/**/TEST-*.xml', allowEmptyResults: true, skipPublishingChecks: true
                    }
                }
            }
        }
        stage('Resolve and Export Applications'){
            steps  {
                echo "I am exporting applications on branch: ${env.GIT_BRANCH}"

                sh "./gradlew org.civitas.meter.runtime:resolve.meter.runtime_base --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
                sh "./gradlew org.civitas.meter.runtime:export.meter.runtime_docker --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
                sh "./gradlew org.civitas.glt.runtime:resolve.glt.runtime_base --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
                sh "./gradlew org.civitas.glt.runtime:export.glt.runtime_docker --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
            }
        }

        stage('Prepare Docker'){
            steps  {
                echo "I am building and publishing a docker image on branch: ${env.GIT_BRANCH}"
                sh "./gradlew prepareDocker --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"

            }
        }
        stage('Docker image build'){
            steps  {
                echo "I am building and publishing a docker image on branch: ${env.GIT_BRANCH}"
                
                step([$class: 'DockerBuilderPublisher',
                      dockerFileDirectory: 'docker/meter',
                            cloud: 'docker',
                            tagsString: 'devel.data-in-motion.biz:6000/civitas/meter:latest',
                            pushOnSuccess: true,
                            pushCredentialsId: 'dim-nexus'])

                step([$class: 'DockerBuilderPublisher',
                      dockerFileDirectory: 'docker/glt',
                            cloud: 'docker',
                            tagsString: 'devel.data-in-motion.biz:6000/civitas/glt:latest',
                            pushOnSuccess: true,
                            pushCredentialsId: 'dim-nexus'])

            }
        }
    }
}
