package org.lang;

public class StateDetails {
	public void southIndia() {
		System.out.println("South India");
	}

	public void northIndia() {
		System.out.println("North India");

	}

	public static void main(String[] args) {
		LanguageInfo I = new LanguageInfo();
		I.tamilLanguage();
		I.englishLanguage();
		I.hindiLanguage();

		StateDetails S = new StateDetails();
		S.northIndia();
		S.southIndia();
	}
}