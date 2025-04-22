class ParkingSystem {

    private Map<Integer, Integer> map;

    public ParkingSystem(int big, int medium, int small) {
        this.map = new HashMap<>();
        this.map.put(1, big);
        this.map.put(2, medium);
        this.map.put(3, small);
    }
    
    public boolean addCar(int carType) {
        int parkingLotCount = this.map.get(carType);
        if (parkingLotCount == 0) return false;
        this.map.put(carType, parkingLotCount - 1);
        return true;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */