public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,3,4,7,8,11,13,23,45,65,77,81};
        int search=13;
        int a=0,b=arr.length-1;
        int mid=(a+b)/2;

        while(a<=b){
            if(arr[mid]==search)
            {
                System.out.println("Element Found at Index: "+mid);
                break;
            }
            else if(arr[mid]<search){
                a=mid+1;
            }
            else{
                b=mid-1;
            }
            mid=(a+b)/2;
        }
        if(a>b) {
            System.out.println("element not found");
        }

    }
}
