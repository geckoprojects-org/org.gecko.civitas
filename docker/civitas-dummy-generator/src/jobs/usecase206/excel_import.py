"""Source System #1: Excel Import (CSV) job for Use Case #206."""

from src.jobs.base import CSVJob
from src.data_generators.plant_data import plant_data_generator
from src.clients.minio_client import minio_client
from src.utils.helpers import format_filename_timestamp


class ExcelImportJob(CSVJob):
    """Job for generating and uploading asset master data CSV files to MinIO."""
    
    def __init__(self):
        super().__init__(
            name="excel_import",
            description="Generate asset master data CSV and upload to MinIO"
        )
    
    def execute(self) -> bool:
        """Execute the Excel Import job."""
        try:
            # Generate basic asset data
            data = plant_data_generator.generate_basic_data()
            
            if not data:
                self.logger.error("No data generated")
                return False
            
            # Define CSV headers
            headers = ['plant_id', 'city', 'zip', 'street', 'type']
            
            # Generate CSV content
            csv_content = self.generate_csv_content(data, headers)
            
            # Generate filename with timestamp
            timestamp = format_filename_timestamp()
            filename = f"basic_data_{timestamp}.csv"
            
            # Upload to MinIO
            success = minio_client.upload_csv_content(csv_content, filename)
            
            if success:
                self.logger.info(f"Successfully uploaded {filename} with {len(data)} records")
                return True
            else:
                self.logger.error(f"Failed to upload {filename}")
                return False
                
        except Exception as e:
            self.logger.error(f"Excel Import job failed: {e}")
            return False


# Global job instance
excel_import_job = ExcelImportJob()
