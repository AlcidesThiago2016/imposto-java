package devsuperior.com.imposto;

import java.util.Locale;
import java.util.Scanner;

public class imposto {
    public static void main(String[] args) {


        Locale.setDefault(Locale.ENGLISH);
        double salario, prestServico, ganhoCap, gMedicos, gEducacional,
        impostSal, impostServ, impostGc, porct, maxDed, gDed, impBt, abat, impDev;

        Scanner sc = new Scanner(System.in);

        System.out.println("Renda anual com salário:");
        salario = sc.nextDouble();
        System.out.println("Renda anual com prestação de serviço:");
        prestServico = sc.nextDouble();
        System.out.println("Renda anual com ganho de capital:");
        ganhoCap = sc.nextDouble();
        System.out.println("Gastos médicos:");
        gMedicos = sc.nextDouble();
        System.out.println("Gastos educacionais:");
        gEducacional = sc.nextDouble();
        System.out.println();

        if ((salario >= 3000) & (salario <= 5000)){
            impostSal = salario * 0.1;
        }else{
            impostSal = salario * 0.2;
        }

        if (prestServico > 0){
            impostServ = prestServico * 0.15;
        }else {
            impostServ = 0;
        }

        if (ganhoCap > 0){
            impostGc = ganhoCap * 0.2;
        }else {
            impostGc = 0;
        }

        gDed = gEducacional + gMedicos;
        impBt = impostSal + impostServ + impostGc;
        porct = impBt * 0.3;

        if (gDed > porct){
            abat = porct;
        }else{
            abat = gDed;
        }

        impDev = impBt - abat;

        System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
        System.out.println();
        System.out.println("CONSOLIDADO DE RENDA:");
        System.out.printf("Imposto sobre salário: %.2f", impostSal);
        System.out.println();
        System.out.printf("Imposto sobre serviços: %.2f", impostServ);
        System.out.println();
        System.out.printf("Imposto sobre ganho de capital: %.2f", impostGc);
        System.out.println();
        System.out.println("DEDUÇÕES:");
        System.out.println();
        System.out.printf("Máximo dedutível: %.2f", abat);
        System.out.println();
        System.out.printf("Gastos dedutíveis: %.2f", gDed);
        System.out.println();
        System.out.println("RESUMO:");
        System.out.println();
        System.out.printf("Imposto bruto total: %.2f", impBt);
        System.out.println();
        System.out.printf("Abatimento: %.2f", abat);
        System.out.println();
        System.out.printf("Imposto devido: %.2f", impDev);
        System.out.println("");
        sc.close();

    }
}
