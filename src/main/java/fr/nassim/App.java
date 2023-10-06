import java.util.Scanner;

public class EligibilitePret {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir le revenu annuel et l'expérience
        // professionnelle en années
        System.out.print("Veuillez saisir votre revenu annuel en euros : ");
        double revenuAnnuel = scanner.nextDouble();

        System.out.print("Veuillez saisir votre expérience professionnelle en années : ");
        int experienceProfessionnelle = scanner.nextInt();

        // Vérifier l'éligibilité pour le prêt
        if (revenuAnnuel > 30000 && experienceProfessionnelle >= 2) {
            System.out.println("Félicitations ! Vous êtes éligible pour un prêt.");

        } else {
            System.out.println("Désolé, vous ne remplissez pas les critères pour obtenir un prêt.");
        }
    }
}
