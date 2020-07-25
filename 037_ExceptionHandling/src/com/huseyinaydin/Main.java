package com.huseyinaydin;

public class Main {

    public static void main(String[] args) {
	    int[] sayilar = new int[]{1,2,3};
	    try{
            System.out.println(sayilar[5]);
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println(e);
        }
	    catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
	    catch (Exception e){
            System.out.println(e);
        }
	    finally {
            System.out.println("Ben her türlü çalışırım. Bitti!");
        }
    }
}
