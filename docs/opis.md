# Rozbiór elementów Androida na części

1) setContentView – wskazuje, który plik z wyglądem (XML) ma zostać wyświetlony na ekranie danej aktywności.
2) findViewById – odnajduje widok z pliku XML w kodzie Javy po podaniu jego identyfikatora ID.
3) R – automatycznie wygenerowany spis wszystkich zasobów projektu (np. widoków, napisów, obrazków), który pozwala odwoływać się do nich w kodzie.
4) onCreate – funkcja wywoływana automatycznie na samym początku tworzenia ekranu, służąca do przygotowania interfejsu i zmiennych.
5) super.onCreate – uruchamia podstawowe mechanizmy Androida wymagane do poprawnego utworzenia aktywności.
6) AndroidManifest.xml – plik konfiguracyjny aplikacji, zawierający spis jej ekranów, nazwę oraz wymagane uprawnienia.
7) @+id/ – oznaczenie w kodzie XML tworzące nowy, unikalny identyfikator dla wybranego elementu interfejsu.
8) match_parent – powoduje rozciągnięcie elementu na całą dostępną szerokość lub wysokość jego kontenera nadrzędnego.
9) dp – elastyczna jednostka wymiarowania elementów UI, dopasowująca swój rozmiar do gęstości pikseli ekranu.
10) sp – jednostka rozmiaru tekstu, która skaluje się wraz z ustawieniami rozmiaru czcionki wybranymi przez użytkownika w systemie.