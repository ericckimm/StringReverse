public class StringReverses
{
    public static void main (String[] args)
    {
        char[] word = {'h', 'e', 'l', 'l', 'o'};
        reverse(word);
        for(int i = 0; i < word.length; i++)
        {
            System.out.print(word[i] + " ");
        }
    }

    public static void reverse(char[] letters)
    {
        int left = 0;
        int right = letters.length - 1;
        
        while (left < right)
        {
            // Swap the elements at left and right
            char temp = letters[left];
            letters[left] = letters[right];
            letters[right] = temp;
            
            // Move the pointers towards the center
            left++;
            right--;
        }
    }
}
