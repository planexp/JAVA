package com.kodilla.mojeProjekty;

class Tabli {
    public Tabli() {
    }

    public static void main(String[] args) {

        int[] nazwaTablicy = {2,6,7,9,12};

        System.out.println(nazwaTablicy[3]);
    }
}

/*Napisz program, który spośród tablicy liczb całkowitych wybierze takie pary następujących po sobie liczb,
dla których suma jest najmniejsza lub największa. W przypadku, gdy istnieje kilka par, dla których suma jest
najmniejsza lub największa, to użytkownik powinien zobaczyć je wszystkie. Jeżeli jakaś para liczb się powtarza,
to powinna być uwzględniona tylko raz. Tablicę liczb przekaż jako argument wywołania programu.

Przykład 1

wejście: [1, 2, 3, 4, 5]
wyjście: Najmniejsza para [1, 2], największa para [4, 5]*/