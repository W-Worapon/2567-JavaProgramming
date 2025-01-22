public class Smartphone {
	private String brand;
	private String model;
	private int storageCapacity;
	private final int MAX_STORAGE_CAPACITY = 521;
	
	public String getBrand() {
		return this.brand;
	}
	public String getModel(){
		return this.model;
	}
	public int getstorageCapacity() {
		return this.storageCapacity;
	}
	public void setBrand(String brand) {
		if(this.brand.length()<2) {
			System.out.println("Error: Brand must have at least 2 characters!");
		}else {
			this.brand = brand;
		}
	}
	public void setModel(String model) {
		if(this.model.length()<2) {
			System.out.println("Error: Model must have at least 2 characters!");
		}else {
			this.model = model;
		}
	}
	public void setStorageCapacity(int storageCapacity) {
		if(this.storageCapacity>=1 && this.storageCapacity<=512) {
			System.out.println("Error: Storage capacity must be between 1 and 512GB!");
		}else {
			this.storageCapacity = storageCapacity;
		}
	}
	
	//method add storage
	public void increaseStorage(int additionalStorage) {
		if(additionalStorage>0) {
			if(additionalStorage <MAX_STORAGE_CAPACITY) {
				storageCapacity += additionalStorage;
			}else {
				System.out.println("Error: Storage capacity cannot exceed <MAX_STORAGE_CAPACITY> GB!");
			}
		}else {
			System.out.println("Error: Additional storage must be positive!");
		}
	}
	public int getRemainingStorage(int usedStorage) {
		if(usedStorage >= 0 && usedStorage <= storageCapacity) {
			
		}else {
			"Error: Used storage must be between 0 and
			<storageCapacity> GB!"
		}
		
		return -1;
	}
	
}
