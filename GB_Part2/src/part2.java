public class part2 {
    public static void main (String [] args) {
        int[] arrayInt = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        int[] arrayInt6 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] arrayNum = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] arrayBal = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] arrayOff = {1, 2, 3, 4, 5};
        replace0To1 (arrayInt);
        writeArray(8, 3);
        replace6(arrayInt6);
        writeArrayDiagonal(5);
        SearchMinMax(arrayNum);
        System.out.println(isBalanceArray(arrayBal));
        arrayOffset(arrayOff, -3);
    }

    static void replace0To1 (int[] array)
    {
        for(int i=0; i<array.length; i++)
        {
            if (array[i]==0) {
                array[i]=1;
            }
            else
            {
                array[i]=0;
            }
        }
    }

    static void writeArray (int size, int step)
    {
        int[] arr = new int[size];
        for (int i = 0; i<size; i++)
        {
            arr[i]=i*step;
        }

    }

    static void replace6 (int[] array)
    {
        for(int i=0; i<array.length; i++)
        {
            if (array[i]<6) {
                array[i]*=2;
            }
        }
    }

    static void writeArrayDiagonal (int size)
    {
        int[][] arr = new int[size][size];
        for (int i = 0; i<size; i++)
        {
            arr[i][i]=1;
            arr[i][size-i-1]=1;
        }
    }

    static void SearchMinMax (int[] array)
    {
        int numMin=array[0];
        int numMax=array[0];
        for(int i=0; i<array.length; i++)
        {
            if (array[i]<numMin) {
                numMin=array[i];
            }

            if (array[i]>numMax) {
                numMax=array[i];
            }
        }
    }

    static boolean isBalanceArray (int[] array)
    {
        int leftPoint=0;
        int leftSum=array[leftPoint];
        int rightPoint=array.length-1;
        int rightSum=array[rightPoint];

        do  {
            if (leftSum == rightSum)
            {
                leftPoint ++;
                rightPoint --;
                leftSum += array[leftPoint];
                rightSum += array[rightPoint];
            } else if (leftSum > rightSum)
            {
                rightPoint --;
                rightSum += array[rightPoint];
            }else
            {
                leftPoint ++;
                leftSum += array[leftPoint];
            }
        }
        while ((rightPoint-leftPoint)!=1);

        return leftSum==rightSum;
    }

    static void arrayOffset (int[] array, int step)
    {
        int posValue;
        boolean orStep = step>=0;
        step = (step < 0 ? -step : step);
        for(int a=0; a<array.length; a++)
        {
            System.out.print(array[a]);
        }
        System.out.print(" step = " + step);
        System.out.println("");

        if (orStep)
        {
            for(int s=0; s<step; s++)
            {
                for(int i=0; i<array.length-1; i++)
                {
                    posValue=array[i];
                    array[i]=array[array.length-1];
                    array[array.length-1]=posValue;
                }
            }

        }else
        {
            for(int s=0; s<(step); s++)
            {
                for(int i=0; i<array.length-1; i++)
                {
                    posValue=array[i];
                    array[i]=array[i+1];
                    array[i+1]=posValue;
                }
            }

        }

        for(int b=0; b<array.length; b++)
        {
            System.out.print(array[b]);
        }
        System.out.println("");
    }

}
