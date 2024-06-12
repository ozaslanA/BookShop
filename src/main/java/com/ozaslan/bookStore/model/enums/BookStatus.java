package com.ozaslan.bookStore.model.enums;

public enum BookStatus {
    READ,         // Kitap okundu
    UNREAD,       // Kitap henüz okunmadı
    READING,      // Kitap şu anda okunuyor
    TO_BE_READ,   // Kitap okunacaklar listesinde
    ON_HOLD,      // Kitap beklemeye alındı
    ABANDONED,    // Kitap terk edildi
    WISHLIST      // Kitap istek listesinde
}