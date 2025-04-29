package com.example.guizz.ui.data


import com.example.guizz.ui.model.Answer

import com.example.guizz.ui.model.Question

val easyQuestionList = listOf<Question>(
    Question(
        text = "Wie heißt die Hauptstadt von Deutschland", answers = listOf(
            Answer(text = "Berlin", isRight = true),
            Answer(text = "Hamburg", isRight = false),
            Answer(text = "Bern", isRight = false),
            Answer(text = "Madrid", isRight = false)
        )
    ), Question(
        text = "Wie heißt die Hauptstadt von Frankreich", answers = listOf(
            Answer(text = "Berlin", isRight = false),
            Answer(text = "Hamburg", isRight = false),
            Answer(text = "Bern", isRight = false),
            Answer(text = "Paris", isRight = true)
        )
    ),
    Question(
        text = "Was ist die chemische Formel für Wasser?",
        answers = listOf(
            Answer(text = "H₂", isRight = false),
            Answer(text = "CO₂", isRight = false),
            Answer(text = "H₂O", isRight = true),
            Answer(text = "O₂", isRight = false)
        )
    ),
    Question(
        text = "Wer schrieb das Drama „Hamlet“?",
        answers = listOf(
            Answer(text = "William Shakespeare", isRight = true),
            Answer(text = "Charles Dickens", isRight = false),
            Answer(text = "Ernest Hemingway", isRight = false),
            Answer(text = "Leo Tolstoi", isRight = false)
        )
    ),
    Question(
        text = "Wieviel ist 7 × 8?",
        answers = listOf(
            Answer(text = "54", isRight = false),
            Answer(text = "56", isRight = true),
            Answer(text = "64", isRight = false),
            Answer(text = "49", isRight = false)
        )
    ),
    Question(
        text = "Welcher Sport verwendet einen Federball (Shuttlecock)?",
        answers = listOf(
            Answer(text = "Badminton", isRight = true),
            Answer(text = "Tennis", isRight = false),
            Answer(text = "Squash", isRight = false),
            Answer(text = "Tischtennis", isRight = false)
        )
    ),
    Question(
        text = "In welcher Sprache wurde „Don Quijote“ ursprünglich geschrieben?",
        answers = listOf(
            Answer(text = "Spanisch", isRight = true),
            Answer(text = "Englisch", isRight = false),
            Answer(text = "Französisch", isRight = false),
            Answer(text = "Italienisch", isRight = false)
        )
    ),
    Question(
        text = "Wer gilt als „King of Pop“?",
        answers = listOf(
            Answer(text = "Elvis Presley", isRight = false),
            Answer(text = "Michael Jackson", isRight = true),
            Answer(text = "Prince", isRight = false),
            Answer(text = "Madonna", isRight = false)
        )
    ),
    Question(
        text = "Die Mitochondrien werden oft bezeichnet als …?",
        answers = listOf(
            Answer(text = "Der Stoffwechsel-Detektor", isRight = false),
            Answer(text = "Das Zell-Etikett", isRight = false),
            Answer(text = "Die Zellmembran", isRight = false),
            Answer(text = "Kraftwerke der Zelle", isRight = true)
        )
    ),
    Question(
        text = "Wer führte Regie bei „Jurassic Park“ (1993)?",
        answers = listOf(
            Answer(text = "Steven Spielberg", isRight = true),
            Answer(text = "James Cameron", isRight = false),
            Answer(text = "Martin Scorsese", isRight = false),
            Answer(text = "Quentin Tarantino", isRight = false)
        )
    ),
    Question(
        text = "Wofür steht die Abkürzung CPU im Computer-Bereich?",
        answers = listOf(
            Answer(text = "Central Processing Unit", isRight = true),
            Answer(text = "Computer Personal Unit", isRight = false),
            Answer(text = "Control Program Unit", isRight = false),
            Answer(text = "Central Performance Unit", isRight = false)
        )
    ),
    Question(
        text = "Wer malte die Mona Lisa?",
        answers = listOf(
            Answer(text = "Pablo Picasso", isRight = false),
            Answer(text = "Leonardo da Vinci", isRight = true),
            Answer(text = "Vincent van Gogh", isRight = false),
            Answer(text = "Claude Monet", isRight = false)
        )
    ),
    Question(
        text = "Welches ist der größte Ozean der Erde?",
        answers = listOf(
            Answer(text = "Arktischer Ozean", isRight = false),
            Answer(text = "Indischer Ozean", isRight = false),
            Answer(text = "Pazifischer Ozean", isRight = true),
            Answer(text = "Atlantischer Ozean", isRight = false)
        )
    ),
    Question(
        text = "Wie sagt man „Danke“ auf Japanisch?",
        answers = listOf(
            Answer(text = "Arigatō", isRight = true),
            Answer(text = "Hola", isRight = false),
            Answer(text = "Merci", isRight = false),
            Answer(text = "Danke", isRight = false)
        )
    ),
    Question(
        text = "Welches chemische Symbol steht für Gold?",
        answers = listOf(
            Answer(text = "Ag", isRight = false),
            Answer(text = "Fe", isRight = false),
            Answer(text = "Au", isRight = true),
            Answer(text = "Pb", isRight = false)
        )
    ),
    Question(
        text = "In welcher Galaxie befindet sich unser Sonnensystem?",
        answers = listOf(
            Answer(text = "Andromedagalaxie", isRight = false),
            Answer(text = "Milchstraße", isRight = true),
            Answer(text = "Messier 81", isRight = false),
            Answer(text = "Sombrerogalaxie", isRight = false)
        )
    ),
    Question(
        text = "Wieviele Spieler stehen bei einem Basketballspiel pro Team gleichzeitig auf dem Feld?",
        answers = listOf(
            Answer(text = "6", isRight = false),
            Answer(text = "5", isRight = true),
            Answer(text = "4", isRight = false),
            Answer(text = "7", isRight = false)
        )
    ),
    Question(
        text = "In welchem Jahr endete der Zweite Weltkrieg?",
        answers = listOf(
            Answer(text = "1918", isRight = false),
            Answer(text = "1945", isRight = true),
            Answer(text = "1939", isRight = false),
            Answer(text = "1941", isRight = false)
        )
    ),
    Question(
        text = "Wofür steht HTML?",
        answers = listOf(
            Answer(text = "HighText Machine Language", isRight = false),
            Answer(text = "HyperText Markdown Language", isRight = false),
            Answer(text = "HyperText Markup Language", isRight = true),
            Answer(text = "Hyperlinking Text Management Language", isRight = false)
        )
    ),
    Question(
        text = "Wieviele Knochen hat ein erwachsener Mensch etwa?",
        answers = listOf(
            Answer(text = "196", isRight = false),
            Answer(text = "206", isRight = true),
            Answer(text = "216", isRight = false),
            Answer(text = "226", isRight = false)
        )
    )
)
val mediumQuestionList = listOf<Question>(
    Question(
        text = "Wer war der erste Bundeskanzler der Bundesrepublik Deutschland?", answers = listOf(
            Answer(text = "Willy Brandt", isRight = false),
            Answer(text = "Konrad Adenauer", isRight = true),
            Answer(text = "Helmut Kohl", isRight = false),
            Answer(text = "Gerhard Schröder", isRight = false)
        )
    ), Question(
        text = "Was ist der größte gemeinsame Teiler (ggT) von 48 und 180?", answers = listOf(
            Answer(text = "6", isRight = false),
            Answer(text = "24", isRight = false),
            Answer(text = "12", isRight = true),
            Answer(text = "36", isRight = false)
        )
    ), Question(
        text = "Welche Galaxie ist der Milchstraße am nächsten?", answers = listOf(
            Answer(text = "Andromeda-Galaxie", isRight = true),
            Answer(text = "Dreiecksnebel", isRight = false),
            Answer(text = "Sombrerogalaxie", isRight = false),
            Answer(text = "Magellansche Wolken", isRight = false)
        )
    ), Question(
        text = "Für welches chemische Element steht das Symbol ‚Hg‘?", answers = listOf(
            Answer(text = "Gold", isRight = false),
            Answer(text = "Silber", isRight = false),
            Answer(text = "Wasserstoff", isRight = false),
            Answer(text = "Quecksilber", isRight = true)
        )
    ), Question(
        text = "Wer schrieb den Roman ‚Der Prozess‘?", answers = listOf(
            Answer(text = "Franz Kafka", isRight = true),
            Answer(text = "Thomas Mann", isRight = false),
            Answer(text = "Hermann Hesse", isRight = false),
            Answer(text = "Friedrich Schiller", isRight = false)
        )
    ), Question(
        text = "Wer komponierte die 9. Sinfonie?", answers = listOf(
            Answer(text = "Wolfgang Amadeus Mozart", isRight = false),
            Answer(text = "Johannes Brahms", isRight = false),
            Answer(text = "Ludwig van Beethoven", isRight = true),
            Answer(text = "Franz Schubert", isRight = false)
        )
    ), Question(
        text = "In welcher Stadt fanden die Olympischen Sommerspiele 1992 statt?", answers = listOf(
            Answer(text = "Atlanta", isRight = false),
            Answer(text = "Barcelona", isRight = true),
            Answer(text = "Los Angeles", isRight = false),
            Answer(text = "Sydney", isRight = false)
        )
    ), Question(
        text = "Welcher Fluss ist mit ca. 3.530 km der längste Europas?", answers = listOf(
            Answer(text = "Donau", isRight = false),
            Answer(text = "Rhein", isRight = false),
            Answer(text = "Dnjepr", isRight = false),
            Answer(text = "Wolga", isRight = true)
        )
    ), Question(
        text = "In welchem Jahr begann der Zweite Weltkrieg?", answers = listOf(
            Answer(text = "1939", isRight = true),
            Answer(text = "1945", isRight = false),
            Answer(text = "1914", isRight = false),
            Answer(text = "1929", isRight = false)
        )
    ), Question(
        text = "Wofür steht die Abkürzung ‚HTTP‘?", answers = listOf(
            Answer(text = "HyperText Transmission Protocol", isRight = false),
            Answer(text = "Hyperlink Transfer Text Protocol", isRight = false),
            Answer(text = "HyperText Transfer Protocol", isRight = true),
            Answer(text = "Hyperlinking Text Transfer Protocol", isRight = false)
        )
    ), Question(
        text = "Wie viele Chromosomen hat ein menschlicher diploider Zellkern?", answers = listOf(
            Answer(text = "23", isRight = false),
            Answer(text = "46", isRight = true),
            Answer(text = "92", isRight = false),
            Answer(text = "44", isRight = false)
        )
    ), Question(
        text = "Welche Währung wurde 1999 als Buchgeld in der EU eingeführt?", answers = listOf(
            Answer(text = "Deutsche Mark", isRight = false),
            Answer(text = "Französischer Franc", isRight = false),
            Answer(text = "Italienische Lira", isRight = false),
            Answer(text = "Euro", isRight = true)
        )
    ), Question(
        text = "Zu welcher Kunstrichtung gehört Salvador Dalís ‚Die Beständigkeit der Erinnerung‘?",
        answers = listOf(
            Answer(text = "Impressionismus", isRight = false),
            Answer(text = "Surrealismus", isRight = true),
            Answer(text = "Expressionismus", isRight = false),
            Answer(text = "Kubismus", isRight = false)
        )
    ), Question(
        text = "Wer führte Regie bei ‚Pulp Fiction‘?", answers = listOf(
            Answer(text = "Quentin Tarantino", isRight = true),
            Answer(text = "Martin Scorsese", isRight = false),
            Answer(text = "Ridley Scott", isRight = false),
            Answer(text = "Steven Spielberg", isRight = false)
        )
    ), Question(
        text = "Wer war US-Präsident während des Zweiten Weltkriegs?", answers = listOf(
            Answer(text = "Harry S. Truman", isRight = false),
            Answer(text = "Dwight D. Eisenhower", isRight = false),
            Answer(text = "Woodrow Wilson", isRight = false),
            Answer(text = "Franklin D. Roosevelt", isRight = true)
        )
    ), Question(
        text = "Wie viele Bundesländer hat Deutschland?", answers = listOf(
            Answer(text = "15", isRight = false),
            Answer(text = "14", isRight = false),
            Answer(text = "16", isRight = true),
            Answer(text = "17", isRight = false)
        )
    ), Question(
        text = "Welche Sprache hat weltweit die meisten Muttersprachler?", answers = listOf(
            Answer(text = "Mandarin", isRight = true),
            Answer(text = "Englisch", isRight = false),
            Answer(text = "Spanisch", isRight = false),
            Answer(text = "Hindi", isRight = false)
        )
    ), Question(
        text = "Wer entdeckte das Penicillin?", answers = listOf(
            Answer(text = "Louis Pasteur", isRight = false),
            Answer(text = "Alexander Fleming", isRight = true),
            Answer(text = "Robert Koch", isRight = false),
            Answer(text = "Joseph Lister", isRight = false)
        )
    )
)
val hardQuestionList = listOf<Question>(
    Question(
        text = "Wer formulierte die spezielle Relativitätstheorie?", answers = listOf(
            Answer(text = "Isaac Newton", isRight = false),
            Answer(text = "Albert Einstein", isRight = true),
            Answer(text = "Max Planck", isRight = false),
            Answer(text = "Niels Bohr", isRight = false)
        )
    ), Question(
        text = "Welches chemische Element hat die Ordnungszahl 74?", answers = listOf(
            Answer(text = "Wolfram", isRight = true),
            Answer(text = "Tantal", isRight = false),
            Answer(text = "Molybdän", isRight = false),
            Answer(text = "Kupfer", isRight = false)
        )
    ), Question(
        text = "In welcher Epoche wirkte Caspar David Friedrich?", answers = listOf(
            Answer(text = "Biedermeier", isRight = false),
            Answer(text = "Romantik", isRight = true),
            Answer(text = "Expressionismus", isRight = false),
            Answer(text = "Barock", isRight = false)
        )
    ), Question(
        text = "Welcher griechische Philosoph war Lehrer von Alexander dem Großen?",
        answers = listOf(
            Answer(text = "Platon", isRight = false),
            Answer(text = "Aristoteles", isRight = true),
            Answer(text = "Sokrates", isRight = false),
            Answer(text = "Epikur", isRight = false)
        )
    ), Question(
        text = "Was besagt das Noether-Theorem?", answers = listOf(
            Answer(text = "Zusammenhang von Symmetrien und Erhaltungsgrößen", isRight = true),
            Answer(text = "Relation zwischen Masse und Energie", isRight = false),
            Answer(text = "Beschreibung von Wellenfunktionen", isRight = false),
            Answer(text = "Grundlage der Quantenmechanik", isRight = false)
        )
    ), Question(
        text = "Wer schrieb „Ulysses“?", answers = listOf(
            Answer(text = "Virginia Woolf", isRight = false),
            Answer(text = "James Joyce", isRight = true),
            Answer(text = "Ernest Hemingway", isRight = false),
            Answer(text = "F. Scott Fitzgerald", isRight = false)
        )
    ), Question(
        text = "Welcher Maler schuf „Die Schule von Athen“?", answers = listOf(
            Answer(text = "Michelangelo", isRight = false),
            Answer(text = "Leonardo da Vinci", isRight = false),
            Answer(text = "Raffael", isRight = true),
            Answer(text = "Donatello", isRight = false)
        )
    ), Question(
        text = "Welches chemische Element hat die höchste Dichte?", answers = listOf(
            Answer(text = "Gold", isRight = false),
            Answer(text = "Osmium", isRight = true),
            Answer(text = "Iridium", isRight = false),
            Answer(text = "Blei", isRight = false)
        )
    ), Question(
        text = "Was versteht man in der Informatik unter NP-Vollständigkeit?", answers = listOf(
            Answer(
                text = "Probleme, die in polynomieller Zeit gelöst werden können", isRight = false
            ), Answer(
                text = "Probleme, deren Lösungen in polynomieller Zeit verifiziert werden können",
                isRight = false
            ), Answer(
                text = "Probleme, die mindestens so schwer sind wie jedes Problem in NP",
                isRight = true
            ), Answer(text = "Probleme außerhalb der Komplexitätsklasse P", isRight = false)
        )
    ), Question(
        text = "Wer entdeckte die Doppelhelix-Struktur der DNA?", answers = listOf(
            Answer(text = "Rosalind Franklin", isRight = false),
            Answer(text = "Linus Pauling", isRight = false),
            Answer(text = "James Watson und Francis Crick", isRight = true),
            Answer(text = "Gregor Mendel", isRight = false)
        )
    ), Question(
        text = "Welche Iterationsgleichung definiert die Mandelbrot-Menge?", answers = listOf(
            Answer(text = "zₙ₊₁ = zₙ² + c", isRight = true),
            Answer(text = "zₙ₊₁ = zₙ³ + c", isRight = false),
            Answer(text = "zₙ₊₁ = zₙ + 1", isRight = false),
            Answer(text = "zₙ₊₁ = c² + zₙ", isRight = false)
        )
    ), Question(
        text = "Welches ist das kleinste Primzahlzwillingspaar?", answers = listOf(
            Answer(text = "5 und 7", isRight = false),
            Answer(text = "11 und 13", isRight = false),
            Answer(text = "3 und 5", isRight = true),
            Answer(text = "17 und 19", isRight = false)
        )
    ), Question(
        text = "Wer ist Autor von „Die Welt als Wille und Vorstellung“?", answers = listOf(
            Answer(text = "Immanuel Kant", isRight = false),
            Answer(text = "Friedrich Nietzsche", isRight = false),
            Answer(text = "Arthur Schopenhauer", isRight = true),
            Answer(text = "Georg Wilhelm Friedrich Hegel", isRight = false)
        )
    ), Question(
        text = "Was misst die Plancksche Konstante?", answers = listOf(
            Answer(text = "Verhältnis von Energie und Frequenz eines Photons", isRight = true),
            Answer(text = "Dichte elementarer Teilchen", isRight = false),
            Answer(text = "Wellenlänge und Geschwindigkeit", isRight = false),
            Answer(text = "Elektronenladung", isRight = false)
        )
    ), Question(
        text = "Welche Auffassung vertritt der solipsistische Skeptizismus?", answers = listOf(
            Answer(text = "Nur das eigene Bewusstsein existiert zweifelsfrei", isRight = true),
            Answer(text = "Die Existenz einer äußeren Welt ist gesichert", isRight = false),
            Answer(text = "Nur materielle Dinge sind real", isRight = false),
            Answer(text = "Nur objektive Wahrheiten sind gültig", isRight = false)
        )
    ), Question(
        text = "Was beschreibt die Schrödingergleichung?", answers = listOf(
            Answer(
                text = "Zeitabhängige Gleichung zur Beschreibung der Quantenzustände",
                isRight = true
            ),
            Answer(text = "Relativistische Bewegungsgleichung für Teilchen", isRight = false),
            Answer(text = "Beschreibung der Gravitation", isRight = false),
            Answer(text = "Grundgleichung der Thermodynamik", isRight = false)
        )
    ), Question(
        text = "Welcher Komponist schrieb die Oper „Idomeneo“?", answers = listOf(
            Answer(text = "Ludwig van Beethoven", isRight = false),
            Answer(text = "Gioachino Rossini", isRight = false),
            Answer(text = "Wolfgang Amadeus Mozart", isRight = true),
            Answer(text = "Giuseppe Verdi", isRight = false)
        )
    ), Question(
        text = "Welches Land besitzt die größten bekannten Erdölreserven?", answers = listOf(
            Answer(text = "Saudi-Arabien", isRight = false),
            Answer(text = "Venezuela", isRight = true),
            Answer(text = "Kanada", isRight = false),
            Answer(text = "USA", isRight = false)
        )
    )
)