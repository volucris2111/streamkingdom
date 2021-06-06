# StreamKingdom

StreaKingdom ist ein Browsergame, welches für Streamer gemacht ist. Es soll den Viewern eine kleine Nebenbeschäftigung bieten, die Kommunikation untereinander steigern und das Gruppengefühl einer Community stärken. Dazu soll es Beziehungen unter Streamern stärken und neue bilden. Es soll **keinen* Streit verursachen, weswegen auf PvP mit verlusten und ähnliches bewusst verzichtet wird.
Es ist eine mittelalterliche Wirtschaftssimulation, in der der **Streamer** der **Regent** eines Reiches ist und die **Viewer** die Rolle der **Bewohner** übernehmen. Durch Spezialisierung der Bewohner können kleinere Streamer auch mit etwas größeren Streamern interagieren, in dem sie ihre höherwertigen Waren an dessen Reich verkaufen können und benötigte Waren von da kaufen können.

**_Regent:_**
Soll in das Geschehen eingriffen können, aber soll nicht zu sehr vom Stream abgelenkt werden. Kann folgende Tätigkeiten nachgehen:
- Legt Steuern fest
- Führt Beziehungen zu andere Regenten
- Vergibt Rollen wie Diplomaten, Unterhändler usw.
- Ruft Turniere und "Highlandgames" aus
- Vergibt Aufträge für Ware, Kopfgelder und andere Dinge
- Baut neue Gebäude
- Lässt inaktive Gebäude räumen

**_Bewohner:_**
Sollen zwischendurch kleine Aufgaben nachgehen können und zu Interaktion/Chatten mit anderen Bewohnern angespornt werden. Diese sollen jedoch nur kurzweilige Interaktionen sein, um nicht zu permanent vom Stream abgelenkt zu sein:
- Steuert seinen Avatar
- Baut seine Fähigkeiten durch Benutzung aus
- Erlernt neue Produkte
- Verbessert die Qualität seiner Produkte
- Produziert Ware für die Stadt und andere Bewohner
- Handelt mit anderen Bewohner
- Nimmt an Turniere und Highlandgames teil
- Kauft Baufläche vom Regenten (max. insgesamt 3 - erstes wird kostenlos platziert)
- Heuert andere Meister für Betriebe an
- Bekämpft NPCs

**_KI:_**
- Senkt/Erhöht Einwohnerzahlen (je nach Stimmung)
- Steuert Bedarf vom Markt/kauft von Spieler Ware
- Generiert neue arbeitsuchende Meister in Tavernen
- Spawnt Gegner in Dungeons
- Erzeugt zufällig Ereignisse wie Überfälle, Seuchen, Nahrungsknappheit u.ä.

Minigames:
- Gemeinsame Dungeons
- Turniere (Reich internet und Reiche übergreifend (Jedes Reich darf 2 - 3 "Champions" entsenden) verschiedene Waffengattungen usw.) für kämpferische Avatare, Highlandgames für Handwerker usw.
- Kneipenschlägereien/Wetttrinken

Jeder Spieler sammelt alle 5 Minuten (1 Tick), die er im Stream ist, Aktionspunkte, die er dann in Aktionen wie Produktion, Ware verschicken, Kämpfen, Minigames usw. einlösen kann. Die Aktionen benötigen eine bestimmte Anzahl an Ticks, bis sie durchgeführt wurden, anhängig der Aktion bzw. den Umständen (je weiter die Ware verschickt werden muss, desto mehr Ticks)

Berufe werden in 2 Tätigkeitsfelder und 2 "Communityinteraktionsarten" unterteilt:

- Kämpferische und Handwerklicke Berufe:
- Chatter und Lurker

Bsp.:
**Kämpferischer Lurker**: Hat mehrere Söldner, die für ihm kämpfen, weswegen er nicht auf die Hilfe angewiesen ist. Kann gut gegen größere Gruppen aus schwache Gegner kämpfen. Erbeudete Ware kann von vielen Handwerkern gebraucht werden und daher problemlos dem Markt verkauft werden, ohne vorher zu fragen, ob es wirklich benötigt wird. Ausrüstung für Söldner kann auf dem Markt gekauft werden.
**Kämpferischer Chatter**: Hat wenige starke Kämpfer, die mit besonderen Waffen von anderen Handwerker ausgestattet werden müssen, weswegen hier eine Absprache stattfinden muss. Können besonders starke Gegner besiegen, aber haben gegen große Truppen probleme. Die Beute wird vor allem von speziellen Handwerker benötigt, weswegen vorher erfragt werden muss, ob es sich lohnt, diese Gegner zu jagen

Bsp. Kämpferische Professionen: Magier, Krieger, Schütze, Hauptmann, ....

**Handwerker Lurker**: Stellt Ware vor allem in Großer Menge für die Stadt her, benötigt keine besondere Waren, dafür aber in großer Menge.
**Handwerker Chatter**: Stellt besondere Ware für Helden, Gebäude erweiterungen und ähnliches her. Daher muss im Chat erfragt werden, ob es kriegerische Helden gibt, die bestimmte Waffen, Ausrüstungen u.ä. benötigen.

Bsp. Handwerklicke Professionen: Schreiner, Bergbau, Alchemist, Lederer, usw.

**_Gegenstände:_**
Alle Gegenstände haben eine Qualitätsstufe, welche bei der Herstellung durch folgende Faktoren bestimmt wird:
- Stufe im Handwerk
- Stufe/Wissen im Rezept
- Ausbaustufe der Produktionsstätte
- Qualität des verwendeten Materials
- Glück ;)

**_Überlegungen:_**
- Soll es Diebe/Räumer/Spione geben? (Könnte Probleme unter Streamern geben, deswegen unsicher)
- Wie können Chatter (viel Interaktionen mit anderen Spielern) und Lurker (welche nur für sich spielen wollen) jeweils ein für sie passendes Spielangebot gemacht werden?
- Kommunikation von Streamern durch Botenreitern: Brauchen 2 Ticks, bis der Brief angekommen ist, um nicht zu sehr vom Stream abzulenken und um keine privaten Nachrichten anderer Chatkanäle versehentlich zu veröffentlichen, falls das Spiel gestreamt werden sollte
- Roguelike/Roguelite/Survival?
