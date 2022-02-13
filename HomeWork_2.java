package HomeWork_2;

public class HomeWork_2 {

    public static void main (String[] args) {

        // задание 1
        int[] nums1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int arr1 = nums1.length;
        for (int i = 0; i < arr1; i++) {
            System.out.print(i + "-" + nums1[i] + " ");
        }

        System.out.println(""); // новая строка

        for (int i = 0; i < arr1; i++) // цикл замены замены значений
            if (nums1[i] == 1) {
                nums1[i] = 0;
            } else nums1[i] = 1;
        for (int i = 0; i < arr1; i++) {
            System.out.print(i + "-" + nums1 [i] + " ");
        }

        System.out.println("\n");// новая строка


        // 2 задание
        int[] nums2 = new int[8];
        int arr2 = nums2.length;
        int j = 0;
        for (int i = 0; i < nums2.length; i++, j = j + 3) {
            nums2[i] = j;
        }

        System.out.println (j + "-" + nums2[j]+ " ");


        System.out.println("\n"); // новая строка


        // задание 3
        int[] nums3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int arr3 = nums3.length;

        for(j = 0; j < arr3; j++) {
            if (nums3[j] < 6) nums3[j] = nums3[j] * 2;
        }

        for(j = 0; j < arr3; j++)
        {
            System.out.print (j + "-" + nums3[j]+ " ");
        }

        System.out.println("\n");


        // задание 4

        int[][] arr4 = new int[3][3];
        for (int i = 0; i < arr4.length; i++) {
            for (int b = 0, x = arr4[i].length - 1; j < arr4[i].length; b++, x--) {

                if (i == b || i == x) arr4[i][b] = 1;
                else arr4[i][b] = 0;
                System.out.print(arr4[i][b] + " ");

            }
            System.out.print("\n");
        }

    }

}



