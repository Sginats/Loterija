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

import javax.swing.JOptionPane;
public class uzd2 {

	public static void main(String[] args) {
		String izvele = null, laimigie = "";
		Stack<Integer> steks = new Stack<>();
		Stack<Integer> laimigoSteks = new Stack<>();
		String [] darbibas = {"Veikt izlozi","Apskatīt visus skaitļus", "Apskatīt laimīgos skaitļus", "Apturēt"};
	    do {
		izvele = (String)JOptionPane.showInputDialog(null, "Izvēlies darbību", "Darbību saraksts", JOptionPane.INFORMATION_MESSAGE, null, darbibas, darbibas[0]);
		if (izvele == null) {
			izvele = "Apturēt";
		}
		switch(izvele) {
		case "Veikt izlozi":
			Long Laiks = System.currentTimeMillis();
			if (laimigoSteks.size() > 0) {
				Long starpiba = Laiks - Long.parseLong(laimigie);
				if (starpiba < 60000) {
					JOptionPane.showMessageDialog(null, "Izlozi var veikt tikai pēc 1 minūtes no pēdējās izlozes!",
							"Kļūda", JOptionPane.ERROR_MESSAGE);
					break;
				} else {
					laimigoSteks.clear();
				}
			} else {
				laimigie = Long.toString(Laiks);
			}
			for (int i = 0; i < 3; i++) {
				steks.clear();
				while (steks.size() < 10) {
					int skaitlis = (int) (Math.random() * 10);
					steks.push(skaitlis);
				}
				int laimigais = steks.pop();
				laimigoSteks.push(laimigais);
				
				
			}
			break;
		case "Apskatīt visus skaitļus":
			JOptionPane.showMessageDialog(null, "Visi izlozētie skaitļi ir: " + steks.toString(), "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Apskatīt laimīgos skaitļus":
			JOptionPane.showMessageDialog(null, "Laimīgie skaitļi ir: " + laimigoSteks.toString(), "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
			break;
		}
	}while(!izvele.equals("Apturēt"));
	}
}