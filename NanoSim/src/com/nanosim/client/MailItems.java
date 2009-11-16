package com.nanosim.client;

import java.util.ArrayList;

/**
 * A simple client-side generator of fake email messages.
 */
public class MailItems {

  private static final int NUM_ITEMS = 37;
  private static final int FRAGMENTS_PER_EMAIL = 10;

  private static final String[] senders = new String[] {
      "Darpa", "Darpa", "IBM", "NSF","nanopost", "congress", "ASU", "MIT",
      "MIT", "NSF", "NSF", "RICE", "wwic","NSF", "IBM", "IBM", "nanopost"};

  private static final String[] emails = new String[] {
      "darpa@nanosim.com", "darpa@nanosim.com", "ibm@nanosim.com",
      "nsf@nanosim.com", "nanopost@nanosim.com", "congress@nanosim.com",
      "asu@nanosim.com", "mit@nanosim.com", "mit@nanosim.com",
      "nsf@nanosim.com", "nsf@nanosim.com", "rice@nanosim.com",
      "wwic@nanosim.com", "nsf@nanosim.com", "ibm@nanosim.com", 
      "ibm@nanosim.com", "nanopost@nanosim.com"};

  private static final String[] subjects = new String[] {
      "URGENT TRANSACTION",
      "budget transaction -[Sun, 23 Apr 2010 13:10:03 +0000]",
      "fw: proposal", "new patent", "Read this ASAP", "Research Granted", 
      "[fwd] Read this ASAP", "FWD: new article", "[fwd] Read this ASAP",
      "extra funding", "re: Make sure to post this",
      "Forbidden Knowledge Conference", "denied", "meeting"};

  private static final String[] fragments = new String[] {
      "Dear Friend,<br><br>I am Mr. Mark Boland the Bank Manager of ABN AMRO "
          + "BANK 101 Moorgate, London, EC2M 6SB.<br><br>",
      "I have an urgent and very confidential business proposition for you. On "
          + "July 20, 2001; Mr. Zemenu Gente, a National of France, who used to be a "
          + "private contractor with the Shell Petroleum Development Company in Saudi "
          + "Arabia. Mr. Zemenu Gente Made a Numbered time (Fixed deposit) for 36 "
          + "calendar months, valued at GBP?30, 000,000.00 (Thirty Million Pounds "
          + "only) in my Branch.",
      "I have all necessary legal documents that can be used to back up any "
          + "claim we may make. All I require is your honest Co-operation, "
          + "Confidentiality and A trust to enable us sees this transaction through. "
          + "I guarantee you that this will be executed under a legitimate "
          + "arrangement that will protect you from any breach of the law. Please "
          + "get in touch with me urgently by E-mail and "
          + "Provide me with the following;<br>",
      "The OIL sector is going crazy. This is our weekly gift to you!<br>"
          + "<br>" + "Get KKPT First Thing, This Is Going To Run!<br>" + "<br>"
          + "Check out Latest NEWS!<br>" + "<br>"
          + "KOKO PETROLEUM (KKPT) - This is our #1 pick for next week!<br>"
          + "Our last pick gained $2.16 in 4 days of trading.<br>",
      "LAS VEGAS, NEVADA--(MARKET WIRE)--Apr 6, 2006 -- KOKO Petroleum, Inc. "
          + "(Other OTC:KKPT.PK - News) -<br>KOKO Petroleum, Inc. announced today that "
          + "its operator for the Corsicana Field, JMT Resources, Ltd. (\"JMT\") "
          + "will commence a re-work program on its Pecan Gap wells in the next week. "
          + "The re-work program will consist of drilling six lateral bore production "
          + "strings from the existing well bore. This process, known as Radial Jet "
          + "Enhancement, will utilize high pressure fluids to drill the lateral well "
          + "bores, which will extend out approximately 350\' each.",
      "JMT has contracted with Well Enhancement Services, LLC (www."
          + "wellenhancement.com) to perform the rework on its Pierce nos. 14 and 14a. "
          + "A small sand frac will follow the drilling of the lateral well bores in "
          + "order to enhance permeability and create larger access to the Pecan Gap "
          + "reservoir. Total cost of the re-work per well is estimated to be "
          + "approximately $50,000 USD.",
      "Parab?ns!<br>Voc? Ganhou Um Vale Presente da Botic?rio no valor de "
          + "R$50,00<br>Voc? foi contemplado na Promo??o Respeite Minha Natureza - "
          + "Pulseira Social.<br>Algu?m pode t?-lo inscrito na promo??o! (Amigos(as), "
          + "Namorado(a) etc.).<br>Para retirar o seu pr?mio em uma das nossas Lojas, "
          + "fa?a o download do Vale-Presente abaixo.<br>Ap?s o download, com o "
          + "arquivo previamente salvo, imprima uma folha e salve a c?pia em seu "
          + "computador para evitar transtornos decorrentes da perda do mesmo. "
          + "Lembramos que o Vale-Presente ? ?nico e intransfer?vel.",
      "Large Marketing Campaign running this weekend!<br>" + "<br>"
          + "Should you get in today before it explodes?<br>" + "<br>"
          + "This Will Fly Starting Monday!",
      "PREMIER INFORMATION (PIFR)<br>"
          + "A U.S. based company offers specialized information management "
          + "serices to both the Insurance and Healthcare Industries. The services "
          + "we provide are specific to each industry and designed for quick "
          + "response and maximum security.<br>" + "<br>" + "STK- PIFR<br>"
          + "Current Price: .20<br>"
          + "This one went to $2.80 during the last marketing Campaign!",
      "These partnerships specifically allow Premier to obtain personal health "
          + "information, as governed by the Health In-surancee Portability and "
          + "Accountability Act of 1996 (HIPAA), and other applicable state laws and "
          + "regulations.<br><br>"
          + "Global HealthCare Market Undergoing Digital Conversion",
      ">>   Componentes e decodificadores; confira aqui;<br>"
          + " http://br.geocities.com/listajohn/index.htm<br>",
      "THE GOVERNING AWARD<br>" + "NETHERLANDS HEAD OFFICE<br>"
          + "AC 76892 HAUITSOP<br>" + "AMSTERDAM, THE NETHERLANDS.<br>"
          + "FROM: THE DESK OF THE PROMOTIONS MANAGER.<br>"
          + "INTERNATIONAL PROMOTIONS / PRIZE AWARD DEPARTMENT<br>"
          + "REF NUMBER: 14235/089.<br>" + "BATCH NUMBER: 304/64780/IFY.<br>"
          + "RE/AWARD NOTIFICATION<br>",
      "We are pleased to inform you of the announcement today 13th of April "
          + "2006, you among TWO LUCKY WINNERS WON the GOVERNING AWARD draw held on "
          + "the 28th of March 2006. The THREE Winning Addresses were randomly "
          + "selected from a batch of 10,000,000 international email addresses. "
          + "Your email address emerged alongside TWO others as a category B winner "
          + "in this year\'s Annual GOVERNING AWARD Draw.<br>",
      ">> obrigado por me dar esta pequena aten??o !!!<br>"
          + "CASO GOSTE DE ASSISTIR TV , MAS A SUA ANTENA S? PEGA AQUELES CANAIS "
          + "LOCAIS  OU O SEU SISTEMA PAGO ? MUITO CARO , SAIBA QUE TENHO CART?ES "
          + "DE ACESSO PARA SKY DIRECTV , E DECODERS PARA  NET TVA E TECSAT , "
          + "TUDO GRATIS , SEM ASSINTURA , SEM MENSALIDADE, VC PAGA UMA VEZ S? E "
          + "ASSISTE A MUITOS CANAIS , FILMES , JOGOS , PORNOS , DESENHOS , "
          + "DOCUMENT?RIOS ,SHOWS , ETC,<br><br>"
          + "CART?O SKY E DIRECTV TOTALMENTE HACKEADOS  350,00<br>"
          + "DECODERS NET TVA DESBLOQUEADOS                       390,00<br>"
          + "KITS COMPLETOS SKY OU DTV ANTENA DECODER E CART?O  650,00<br>"
          + "TECSAT FREE   450,00<br>"
          + "TENHO TB ACESS?RIOS , CABOS, LNB .<br>"};

  private static int senderIdx = 0, emailIdx = 0, subjectIdx = 0,
      fragmentIdx = 0;
  private static ArrayList<MailItem> items = new ArrayList<MailItem>();

  static {
    for (int i = 0; i < NUM_ITEMS; ++i) {
      items.add(createFakeMail());
    }
  }

  public static MailItem getMailItem(int index) {
    if (index >= items.size()) {
      return null;
    }
    return items.get(index);
  }

  public static int getMailItemCount() {
    return items.size();
  }

  private static MailItem createFakeMail() {
    String sender = senders[senderIdx++];
    if (senderIdx == senders.length) {
      senderIdx = 0;
    }

    String email = emails[emailIdx++];
    if (emailIdx == emails.length) {
      emailIdx = 0;
    }

    String subject = subjects[subjectIdx++];
    if (subjectIdx == subjects.length) {
      subjectIdx = 0;
    }

    String body = "";
    for (int i = 0; i < FRAGMENTS_PER_EMAIL; ++i) {
      body += fragments[fragmentIdx++];
      if (fragmentIdx == fragments.length) {
        fragmentIdx = 0;
      }
    }

    return new MailItem(sender, email, subject, body);
  }
}
