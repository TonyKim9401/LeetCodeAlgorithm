class FoodInfo implements Comparable<FoodInfo> {
    private String food;
    private String cuisine;
    private Integer rating;

    public FoodInfo(String food, String cuisine, Integer rating) {
        this.food = food;
        this.cuisine = cuisine;
        this.rating = rating;
    }

    public String getFood() {
        return this.food;
    }

    public String getCuisine() {
        return this.cuisine;
    }

    public Integer getRating() {
        return this.rating;
    }

    public void setRating(Integer newRating) {
        this.rating = newRating;
    }

    @Override
    public int compareTo(FoodInfo other) {
        if (!this.rating.equals(other.rating)) {
            return other.rating - this.rating;
        }
        return this.food.compareTo(other.food);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof FoodInfo)) return false;
        return this.food.equals(((FoodInfo) obj).food);
    }

    @Override
    public int hashCode() {
        return food.hashCode();
    }
}

class FoodRatings {
    private Map<String, FoodInfo> foodMap = new HashMap<>();
    private Map<String, TreeSet<FoodInfo>> cuisineMap = new HashMap<>();

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        for (int i = 0; i < foods.length; i++) {
            FoodInfo foodInfo = new FoodInfo(foods[i], cuisines[i], ratings[i]);
            foodMap.put(foods[i], foodInfo);

            cuisineMap.putIfAbsent(cuisines[i], new TreeSet<>());
            cuisineMap.get(cuisines[i]).add(foodInfo);
        }
    }

    public void changeRating(String food, int newRating) {
        FoodInfo foodInfo = foodMap.get(food);
        TreeSet<FoodInfo> set = cuisineMap.get(foodInfo.getCuisine());

        set.remove(foodInfo);               
        foodInfo.setRating(newRating);      
        set.add(foodInfo);                  
    }

    public String highestRated(String cuisine) {
        return cuisineMap.get(cuisine).first().getFood();
    }
}



/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */