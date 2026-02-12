package practice;

import java.util.Scanner;

public class one {
        public static void main(String[] args) {
          int []arr={5, 9, 2, 9, 4, 2, 9 ,2};
            int a=findMax(arr);
            System.out.print("Maximum value: "+a);

            int b=countOccurrences(arr,a);
            System.out.println();
            System.out.print("It occurs "+b+" times");

            int c=firstPositionOfMax(arr,a);
            System.out.println();
            System.out.print("First position of maximum: "+c);

            int d=findMin(arr);
            System.out.println();
            System.out.print("Minimum value: "+d);

            int e=countOccurrences(arr,d);
            System.out.println();
            System.out.print("It occurs "+e+" times");

            int f=lastPositionOfMin(arr,d);
            System.out.println();
            System.out.print("Last position of minimum: "+f);


        }
        public static void readArray(int[] arr){
            Scanner sc=new Scanner(System.in);
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }

        }
        public static int findMax(int[] arr){
            int max=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if(max<arr[i]){
                    max=arr[i];
                }
            }
            return max;
        }
        public static int findMin(int[] arr){
            int min=Integer.MAX_VALUE;
            for(int i=0;i<arr.length;i++){
                if(min>arr[i]){
                    min=arr[i];
                }
            }
            return min;
        }
        public static int countOccurrences(int[] arr,int value){
            int count=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==value){
                    count++;
                }
            }
            return count;
        }
        public static int firstPositionOfMax(int[] arr,int max){
            int pos=-1;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==max){
                    pos+=i+1;
                    break;
                }

            }
            return pos;
        }
        public static int lastPositionOfMin(int[] arr,int min){
            int pos=-1;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==min){
                    pos+=i+1;
                }

            }
            return pos;

        }
    }

