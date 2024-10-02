import java.util.Scanner;

public class Main {

    public static double getICMSRate(String originState, String destinationState) {
        if (originState.equalsIgnoreCase("SP") && destinationState.equalsIgnoreCase("RJ")) {
            return 12.0;
        } else if (originState.equalsIgnoreCase("SP") && destinationState.equalsIgnoreCase("DF")) {
            return 7.0;
        }

        return 0.0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double productValue = scanner.nextDouble();

        System.out.print("Digite o valor do frete: ");
        double freight = scanner.nextDouble();

        System.out.print("Digite o valor do seguro: ");
        double insurance = scanner.nextDouble();

        System.out.print("Digite a UF de origem: ");
        String originState = scanner.next();

        System.out.print("Digite a UF de destino: ");
        String destinationState = scanner.next();

        double icmsRate = getICMSRate(originState, destinationState);

        Product product = new Product(productValue, freight, insurance, icmsRate);

        System.out.print("Digite a margem de lucro (em %): ");
        double profitMargin = scanner.nextDouble();

        double finalProductPrice = product.getFinalPrice(profitMargin);
        System.out.println("Preço final do produto: R$ " + finalProductPrice);

        System.out.print("Digite o valor do serviço (se aplicável, ou 0 se não houver): ");
        double serviceValue = scanner.nextDouble();

        if (serviceValue > 0) {
            System.out.print("Digite a alíquota de ISS (em %): ");
            double issRate = scanner.nextDouble();

            Service service = new Service(serviceValue, issRate);
            double finalServicePrice = service.getFinalPrice();
            System.out.println("Preço final do serviço: R$ " + finalServicePrice);
        }

        scanner.close();
    }

}