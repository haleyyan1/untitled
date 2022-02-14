import java.util.ArrayList;

public class Sort
{
    // Part A.  Which Sort is Which?
    public static void selectionSort(int[] elements)
    {
        int it = 0;
        for (int j = 0; j < elements.length - 1; j++)
        {
            int minIndex = j;
            for (int k = j + 1; k < elements.length; k++)
            {
                if (elements[k] < elements[minIndex])
                {
                    minIndex = k;
                }
                it++;
            }
            int temp = elements[j];
            elements[j] = elements[minIndex];
            elements[minIndex] = temp;
        }
        System.out.println("Number of iterations: "+it);
    }

    public static void insertionSort(int[] elements)
    {
        int it = 0;
        for (int j = 1; j < elements.length; j++)
        {
            int temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
            {
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
                it++;
            }
            elements[possibleIndex] = temp;
        }
        System.out.println("Number of iterations: "+it);
    }

    // Part C.  Sorting a 1000-word list!
    public static void selectionSortWordList(ArrayList<String> words)
    {
        for (int j = 0; j < words.size()-1;j++)
        {
            int minIndex = j;
            for (int k = j + 1; k < words.size();k++)
            {
                if (words.get(k).compareTo(words.get(minIndex))<0)
                {
                    minIndex = k;
                }
            }
            String temp=words.get(j);
            words.add(j,words.get(minIndex));
             words.remove(j+1); words.add(minIndex,temp); words.remove(minIndex+1);
       }
    }

    public static void insertionSortWordList(ArrayList<String> words)
    {
        int it = 0;
        for (int j = 1; j < elements.length; j++)
        {
            int temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
            {
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
                it++;
            }
            elements[possibleIndex] = temp;
        }
        System.out.println("Number of iterations: "+it);
    }
}