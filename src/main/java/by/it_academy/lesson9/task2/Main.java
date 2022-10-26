package by.it_academy.lesson9.task2;

public class Main {
    public static void main(String[] args) {
        Abbreviation abbreviation = new Abbreviation();

        abbreviation.addAbbreviation("ИКОМ", "Международный совет музеев");
        abbreviation.addAbbreviation("ОПИ", "отдел письменных источников");
        abbreviation.addAbbreviation("РАХН", "Российская академия художественных наук ");
        abbreviation.addAbbreviation("ОИРУ", "Общество изучения русской усадьбы");

        System.out.println("abbreviation.hasAbbreviation(\"БОПМ\") = " + abbreviation.hasAbbreviation("jhgvb"));
        System.out.println("abbreviation.findExplanationFor(\"ОПИ\") = " + abbreviation.findExplanationFor("ОПИ"));
        abbreviation.printAbbreviations();
        abbreviation.printAbbreviationsWere("ХН");
        abbreviation.printExplanationOfAbbreviationsWhere("ОМ");
    }
}