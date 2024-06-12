package com.ozaslan.bookStore.model.enums;


public enum CategoryType {
    FICTION("Roman"),
    NON_FICTION("Bilim"),
    MYSTERY("Gizem"),
    SCIENCE_FICTION("Bilim Kurgu"),
    FANTASY("Fantazi"),
    HORROR("Korku"),
    THRILLER("Gerilim"),
    BIOGRAPHY("Biyografi"),
    HISTORY("Tarih"),
    SELF_HELP("Kişisel Gelişim"),
    CHILDREN("Çocuk Kitapları");

    private final String displayValue;

    CategoryType(String displayValue) {
        this.displayValue = displayValue;
    }

    /**
     * Kategori tipinin görsel olarak okunabilir bir string değerini döndürür.
     * @return Kategori tipinin görsel değeri
     */
    public String getDisplayValue() {
        return displayValue;
    }
}
