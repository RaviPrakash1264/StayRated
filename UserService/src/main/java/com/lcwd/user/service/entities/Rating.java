package com.lcwd.user.service.entities;

import com.lcwd.user.service.payload.ApiResponse;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Rating {
    private String ratingId;
    private String userId;
    private String hotelId;
    private  int rating;
    private  String feedback;
    private Hotel hotel;

    public Rating() {
        // Default constructor for Jackson
    }
    public String getRatingId() {
        return ratingId;
    }

    public void setRatingId(String ratingId) {
        this.ratingId = ratingId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
    private Rating(Builder builder) {
        this.ratingId = builder.ratingId;
        this.userId = builder.userId;
        this.hotelId = builder.hotelId;
        this.rating = builder.rating;
        this.feedback = builder.feedback;
        this.hotel = builder.hotel;
    }

    public static Builder builder() {
        return new Builder();
    }

    // Static inner builder class
    public static class Builder {
        private String ratingId;
        private String userId;
        private String hotelId;
        private int rating;
        private String feedback;
        private Hotel hotel;

        public Builder ratingId(String ratingId) {
            this.ratingId = ratingId;
            return this;
        }

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder hotelId(String hotelId) {
            this.hotelId = hotelId;
            return this;
        }

        public Builder rating(int rating) {
            this.rating = rating;
            return this;
        }

        public Builder feedback(String feedback) {
            this.feedback = feedback;
            return this;
        }

        public Builder hotel(Hotel hotel) {
            this.hotel = hotel;
            return this;
        }

        public Rating build() {
            return new Rating(this);
        }
    }


}