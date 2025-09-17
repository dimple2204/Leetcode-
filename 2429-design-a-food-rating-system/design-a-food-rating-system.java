class FoodRatings {
    Map<String,String> foodToCuisine;
    Map<String,Integer> foodToRating;
    Map<String, TreeSet<String>> cuisineToFoods;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings){
        foodToCuisine = new HashMap<>();
        foodToRating = new HashMap<>();
        cuisineToFoods = new HashMap<>();

        for(int i=0;i<foods.length;i++){
            String f = foods[i];
            String c = cuisines[i];
            int r = ratings[i];

            foodToCuisine.put(f,c);
            foodToRating.put(f,r);

            cuisineToFoods.computeIfAbsent(c, k-> new TreeSet<>(
                (a,b) -> {
                    int r1 = foodToRating.get(a);
                    int r2 = foodToRating.get(b);
                    if(r1!=r2) return r2 - r1;
                    return a.compareTo(b);
                }
            )).add(f);
        }
    }

    public void changeRating(String food, int newRating){
        String c = foodToCuisine.get(food);
        TreeSet<String> ts = cuisineToFoods.get(c);
        ts.remove(food);       
        foodToRating.put(food, newRating);
        ts.add(food);          
    }

    public String highestRated(String cuisine){
        return cuisineToFoods.get(cuisine).first();
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */