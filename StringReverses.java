public class StringReverses
{
    public static void main (String[] args)
    {
        char[] word = {'h', 'e', 'l', 'l', 'o'};
        char[] reversed = reverse(word);
        for(int i = 0; i < reversed.length; i++)
        {
            System.out.print(reversed[i] + " ");
        }
    }

    public static char[] reverse(char[] letters)
    {
        char[] reversed = new char[letters.length];
        for(int i = 0; i < letters.length; i++)
        {
            reversed[i] = letters[letters.length - 1 - i];
        }
        return reversed;
    }
}