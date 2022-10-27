package by.it_academy.lesson10.task2;

public class Main {
    public static void main(String[] args) {
        Abbreviations abbreviations = new Abbreviations();

        abbreviations.addAbbreviation("ИКОМ", "Международный совет музеев");
        abbreviations.addAbbreviation("ОПИ", "отдел письменных источников");
        abbreviations.addAbbreviation("РАХН", "Российская академия художественных наук ");
        abbreviations.addAbbreviation("ОИРУ", "Общество изучения русской усадьбы");

        System.out.println("abbreviations.hasAbbreviation(\"БОПМ\") = " + abbreviations.hasAbbreviation("jhgvb"));
        System.out.println("abbreviations.findExplanationFor(\"ОПИ\") = " + abbreviations.findExplanationFor("ОПИ"));
        abbreviations.printAbbreviations();
        abbreviations.printAbbreviationsWere("ХН");
        abbreviations.printExplanationOfAbbreviationsWhere("ОМ");
    }
}