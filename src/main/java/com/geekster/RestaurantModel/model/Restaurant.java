package com.geekster.RestaurantModel.model;

public class Restaurant {
   private int id;
   private String restaurantName;
   private String address;
   private String specialDish;
   private int numberOfStaffs;
   private boolean parking;
   private String ratings;

   public Restaurant(int id, String restaurantName, String address, String speciality, int numberOfStaffs, boolean parking, String ratings) {
      this.id = id;
      this.restaurantName = restaurantName;
      this.address = address;
      this.specialDish = speciality;
      this.numberOfStaffs = numberOfStaffs;
      this.parking = parking;
      this.ratings = ratings;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return restaurantName;
   }

   public void setName(String name) {
      this.restaurantName = name;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public String getSpecialDish() {
      return specialDish;
   }

   public void setSpecialDish(String specialDish) {
      this.specialDish = specialDish;
   }

   public int getNumberOfStaffs() {
      return numberOfStaffs;
   }

   public void setNumberOfStaffs(int numberOfStaffs) {
      this.numberOfStaffs = numberOfStaffs;
   }

   public boolean isParking() {
      return parking;
   }

   public void setParking(boolean parking) {
      this.parking = parking;
   }

   public String getRatings() {
      return ratings;
   }

   public void setRatings(String ratings) {
      this.ratings = ratings;
   }
}
