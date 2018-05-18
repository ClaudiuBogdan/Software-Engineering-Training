# What is **Anki**?
 **Anki** is a tool I found on Internet while I was looking for the most *effective* and *efficient* techniques to *learn new topics*. It's based on **space repetition** concept and it turns out that it's working (Science :sunglasses:). Anki is an open source project (here is the [link](https://github.com/dae/anki)) and is highly customizable.

 >Anki is a program which makes remembering things easy. Because it is a lot more efficient than traditional study methods, you can either greatly decrease your time spent studying, or greatly increase the amount you learn.

 ## Video tutorials
 * [Glutanimate](https://www.youtube.com/channel/UCBKvlmuiSfSbH0KEVagdAjA): gamify reviews, memorize lists, image occlusion

## Anki manual
###### A short description of utilities Anki has. [Official page](https://apps.ankiweb.net/docs/manual.html)

* **Best Practices** :
  * **Keep it simple**: The shorter your cards, the easier they are to review.
  * **Don’t memorize without understanding**: The best way to learn anything is by knowing the context and relating the new concept with the context.

* [Basics](https://apps.ankiweb.net/docs/manual.html#the-basics)

  * **Cards**: *question* and *answer* pair.    
    * This is based on a *paper flashcard* with a question on one side and the answer on the back.

  * **Decks**: group of cards.
    * Decks are best used to hold **broad categories of cards**.
    * You can **place cards in different decks** to study parts of your card collection instead of studying everything at once.
    * Each deck can have **different settings**.   
    * Decks can **contain other decks** ( “::”).   

  * **Fields**: piece of related information.
    * Split the content of a card into **pieces**.
  * **Note**: group of fields.
    * Specifies how fields are grouped to form a card.
  * **Card Types**: blueprint to create cards based on notes.
    * Specifies which fields should be displayed on the **front** or **back** of each card.
    * Each card type has **two templates**, one for the **question** and one for the **answer**.
    ```
    Q: {{FieldOfQuestion}}
    A: {{FieldOfAnswer}}
        SomeText {{OtherField}}
    ```

  * **Note Types**:  allows to create different types of notes for different material.
  * Each type of note has its **own set of fields and card types**.
  * Create a **separate note type for each broad topic** you’re studying.
  * The **standard note types**:
    * **Basic**: Has Front and Back fields, and will create one card.
    * **Basic (and reversed card)**: Like Basic, but creates two cards for the text you enter: one from front→back and one from back→front.
    * **Basic (optional reversed card)**: This is a front→back card, and optionally a back→front card.  To do this, it has a third field called “Add Reverse.” If you enter any text into that field, a reverse card will be created.
    * **Cloze**: A note type which makes it easy to select text and turn it into a cloze deletion. **Cloze deletion** is the process of *hiding one or more words in a sentence*.
      * **Examples**: <br>
      Anki will replace the text with:
      ```
      Canberra was founded in {{c1::1913}}.
      ```
      Anki will create two cards:
      ```
      {{c2::Canberra}} was founded in {{c1::1913}}.
      ```
      Anki will treat the text after the two colons as a hint
      ```
      {{c1::Canberra::city}} was founded in 1913
      ```

  * **Collection**: all the material stored in Anki.


* [Cards and templates](https://apps.ankiw eb.net/docs/manual.html#cards-and-templates) <br>
  * *Anki creates cards **automatically***, based on the notes you add.
  * You can *configure the cards* Anki should create and what should be shown on them when adding or editing material by clicking on the “Cards…” button.
  * In Anki, **templates are written in HTML**, which is the language that web pages are written in. **The styling section is CSS**, which is the language used for styling web pages.
  * The **Deck Override** option allows you to *change the deck that cards generated from the current card type will be placed into*.
  * The **Browser Appearance** option allows you to set different (perhaps simplified) templates for display in the Question and Answer columns of the browser

* [Browser](https://apps.ankiweb.net/docs/manual.html#browser)
  * **Searching** <br>
    [more...](https://apps.ankiweb.net/docs/manual.html#searching)

* Importing for SuperMemo in XML formmat ([link](https://www.supermemo.com/beta/xml/xml-core.htm)). Possibility to create an application that create cards from XML file.
