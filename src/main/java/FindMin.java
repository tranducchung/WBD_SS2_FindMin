public class FindMin {
    private static int minValue(int[] number){
          int min = number[0];
          int index = 0;
          for (int i=0;i<number.length;i++){
              if (number[i]<min){
                  min = number[i];
                  index = i;
              }
          }
          return index;
    }
    public static void main(String[] args) {
        int[] number = {1,-2,3,4,5,6,7};
       int index = minValue(number);
        System.out.println("The smallest element in the array is: "+ number[index]);
    }
}
