package steiks;
/*/
 *Izmantojot JOptionPane klases dialoglodziņus datu ievadei un izvadei, sastādīt programmu,
 * kura pielietojot steku realizēt loterijas trīs laimīgo skaitļu izlozi.
 * Trīs piegājienos steks tiek aizpildīts ar 10 nejaušiem skaitļiem (bumbiņām) intervālā [0;9].
 * Skaitļi pa vienam tiek vilkti ārā no steka un viens no skaitļiem (steka virsējais skaitlis)
 * nejauši tiek iegaumēts un ielikts laimējušo skaitļu stekā. Programma nodrošina izlozes izdarīšanu,
 * piefiksējot izlozes veikšanas datumu un laiku, kā arī laimīgo skaitļu apskatīšanu.
 * Pēc laimīgo skaitļu noteikšanas, izlozi atkārtoti var veikti tikai ja pagājusi vismaz 1 minūte
 */
import java.util.Stack;
public class uzd2 {

	public static void main(String[] args) {
		String izvele, laimigie = "";
		Stack<Integer> steks = new Stack<>();
		Stack<Integer> laimigoSteks = new Stack<>();
		String [] darbibas = {"Veikt izlozi", "Apskatīt laimīgos skaitļus", "Apturēt"};
	}

}
