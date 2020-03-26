package exam;
class StudentExam{
 private char[] key = { 'A', 'A', 'A', 'A', 'A', 'B', 'B', 'B', 'B', 'B',
                        'C', 'C', 'C', 'C', 'C', 'D', 'D', 'D', 'D', 'D' };
 private char[] answers;

 public StudentExam(char[] ans)
 {
 	answers = ans;
 }
 
 public boolean passed ()
 {
  return (totalCorrect() > 14);
 }

 public int totalCorrect()
 {
  int correct = 0;
  for (int i = 0; i < key.length; i++)
 {

 if (key[i] == answers[i])
  correct++;
 }
 return correct;
 }
 
 public int totalIncorrect()
 {
    int tmissed = 0;
    tmissed = key.length - totalCorrect();
    return tmissed;
 }

 public int[] questionsMissed()
 {
	  
  int size = key.length - totalCorrect();
  int[] missed = {};
  if (size < 1)
  return missed;
  else
  missed = new int [size];

  int pos = 0;
  for (int i = 0; i < key.length; i++)
  {
   if (key[i] != answers[i])
   {
	missed[pos] = (i + 1);
	pos = pos + 1;
   }
  }
  return missed;
  
 }
}


