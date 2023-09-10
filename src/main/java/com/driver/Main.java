package com.driver;
public class product{
public int  product(int x , int y){
  return x*y;
  }
  public int  product(int x , int y , int z){
      return x*y;
  }
  public double product(Double x , Double y){
    return x*y;
}
public class Main {
product p = new product();
  p.product(1,1);
  p.product(0,0,0);
  p.product(2.2,2.4);
}
