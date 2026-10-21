# Java Password Generator

Semplice progetto Java che genera una password a partire dai dati personali inseriti dall'utente tramite terminale.

## Obiettivi

- Creare un progetto Java chiamato `java-password-generator`.
- Definire il package `org.lessons.java.security`.
- Creare la classe `PasswordGenerator` con il metodo `main`.

## Funzionalità

Il programma richiede all'utente di inserire:

- Nome
- Cognome
- Colore preferito
- Giorno di nascita
- Mese di nascita
- Anno di nascita

Una volta acquisiti i dati e salvati nelle relative variabili, la stesso somma numericamente giorno, mese e anno di nascita. Procede quindi a generare una password concatenando nome, cognome, colore preferito e la somma ottenuta in precedenza, separati dal carattere -.

## Esempio di utilizzo

**Dati inseriti:**

- Nome: Pinco
- Cognome: Pallo
- Colore preferito: magenta
- Giorno di nascita: 12
- Mese di Nascita: 05
- Anno di nascita: 1994

**Password generata:**

Pinco-Pallo-magenta-2011

La somma della data di nascita è:

12 + 5 + 1994 = 2011

## Tecnologie utilizzate

- Java.
- La classe `Scanner` per l'acquisizione dei dati da terminale.
- Concatenazione di stringhe.
- Operazioni aritmetiche.

## Esecuzione

- Aprire il progetto in Visual Studio Code.
- Eseguire la classe `PasswordGenerator`.
- Inserire i dati richiesti nel terminale.
- Visualizzare la password generata.

