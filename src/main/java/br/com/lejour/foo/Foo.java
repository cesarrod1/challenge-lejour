package br.com.lejour.foo;

public enum Foo {
    USER("https://sheet2api.com/v1/ByR2h1huRjyQ/fiap/user"),
    WEDDING("https://sheet2api.com/v1/ByR2h1huRjyQ/fiap/wedding"),
    INVOICE("https://sheet2api.com/v1/ByR2h1huRjyQ/fiap/invoice"),
    APPOINTMENT("https://sheet2api.com/v1/ByR2h1huRjyQ/fiap/appointment"),
    WEDDING_FAVORITES("https://sheet2api.com/v1/ByR2h1huRjyQ/fiap/wedding_favorites");

    private final String url;

    Foo(String url) {
        this.url = url;
    }

    public String getUrl(){
        return url;
    }

}