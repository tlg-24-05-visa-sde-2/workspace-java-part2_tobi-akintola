package com.entertainment;

import java.util.Objects;

//To be consistent in equals whatever fields were used for equals must bre used with compareto
public class Television implements Comparable<Television>{
    private String brand;
    private int volume;

    private Tuner tuner = new Tuner();

    public Television() {
    }

    public Television(String brand, int volume) {
        setBrand(brand);
        setVolume(volume);
    }

    public int getCurrentChannel(){
        return tuner.getChannel();
    }

    public void changeChannel(int channel){
        tuner.setChannel(channel);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Television that = (Television) obj;
        return getVolume() == that.getVolume() && Objects.equals(getBrand(), that.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getVolume());
    }

    /*    @Override
    public int hashCode(){
        //a poorly written hash function, it easily results in "hash collisions"
        //i.e.,
        //return getBrand().length() + getVolume();

        //instead, we use Objects.hash() to give us a scientifically correct hash function
        //it will minimize the probability of hash collisions

        return Objects.hash(getBrand(), getVolume());
    }

    @Override
    public boolean equals(Object obj){
        boolean result = false;

        if(obj instanceof Television){
            //downcast obj to more specifc reference type television, to call getName() etc
            Television other = (Television) obj;

            //do the check - sameness is defined as same brand, and same volume
            //objects.equals
            result = Objects.equals(this.getBrand(), other.getBrand()) &&
                    this.getVolume() == other.getVolume(); //primitives cannot be null
        }
        return result;
    }*/


    @Override
    public int compareTo(Television other) {
        int result = this.getBrand().compareTo(other.getBrand());

        if (result == 0) {
            result = Integer.compare(this.getVolume(), other.getVolume());
        }
        return result;
    }

    @Override
    public String toString() {
        return String.format("Television [brand=%s, volume=%d, channel=%s]",
                getBrand(), getVolume(), getCurrentChannel());
    }
}