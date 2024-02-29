package com.wesleytelesbenette.apicryptography.services;

import java.util.Arrays;
import java.util.List;

public class CryptographyService
{
    private static final String alphabet = " abcdefghijklmnopqrstuvwxyzáàãâéèêíìîóòôõúùûçABCDEFGHIJKLMNOPQRSTUVWXYZÁÀÃÂÉÈÊÍÌÎÓÒÔÕÚÙÛÇ1234567890<>,.:;/\\'\"!@#$%§¨&|*()-_=+`´{}[]ªº?°\n";
    private static final List<String> encryptedAlphabets = Arrays.asList
    (
        "tJò_pkÍ9ômºesdÚÃO6\\]#XIªy1ÁGÂ-RH´DZ\nÓUÌ3ÔWj=@ÇFw%TÈáÒâab;à`i°AvhCîlúÛNÕoç?uSBqf([óéLín7M4xÎ*<>ÊE¨g)Qù'{ã+,}/ì|À Vê.8r!É0K:cûõYè§&2$Ù5zP\"",
        "*°èªâXô`VFçóÍs.põá 8NéÇÓPÒHq(!ÈT'hDIÉ)&?9§Ìyjv1ÂíJ3]zì%+àmtúxò\nku;êoeÁUY>CO7Ml_,wû[Ê<¨´AW#i4rÔ0ÕBº6ÀÎdQ@${bcãn2/EîÙ:\"5LSRùZKgÛf}ÚG|=\\a-Ã",
        "Xój!yè3ºo7OÃS:\\rf`õ6ùÇÙuãdªí´x[&)EáPÕ tah*ò5nâÒ§Mê+_{}ÎNW°KbgJ2l$Ê'Lô\"\nDRú<.VU8kî#|-Qv4/(9ÌpÚû]?ÍF¨Gw=Ém0Ûç>@cÁI;HCTÔBÀÈeéÂ,1qà%ÓAszìiYZ",
        "ÎGaFã4?ÀNCdç>téÇÓ[EÒû<ê]W\nèàáy@n6vP0!5I1V\"+mÈ8s{ÛÂXÚ7òwrz)ZÃíÍk3Ô¨Õx-âhÙÉìKgRõQº pBTLUÁD,î}´óHÊo#O'SA=%ô2l9ª(Yub:*$|&§`ùc°.M;ei\\qJúÌf_j/",
        "q{9zÂÈìã*ê0_$]J=É@,ô(OÕKúTvY`ghj5iu}?7MÛ%x/Béò<GîWÌ¨X2n#óUù!ª4aõíAÊ´cR+1\nÇpdçÀ6|ZSáÙHlÔs&ÁFÍ§è3;-bÒ'Cr°I[NkûP) wÚÓQ>Ã:âty8\\ÎoàEefLmº\"DV.",
        "DYôjá)°mAGZÓkÎu`;?4Û\"[QÍÂM\\VBÊ¨0Èò´9ú$fvPã7:à2el6bdiIHC_õî3+Éq1ûù(OÀÕac>WºxçK#<NªyÌoÁsÇ*8=h&tF TÙìéw'.]}p§Ã|rEz%íÔ{âÒXÚULRè-5J@/Sn\ngó!ê,",
        "<vOt\nG\\ÚÃ°:JíB=hmÁFùC§6è>ÉÍ7ÒfVwklÙ)Ê\"r$âô/2¨;cTÀie?@êÔML4Q[.UÌDR%ázyÇúÓoãY`óXSEÎàK# ìnZ&uN53ûW,È0gx+çj{aq]ò}ºÕs_bA(Û|´î1é*!ª-8pP'9IHõdÂ",
        "|12Uk¨[ôO!oÈ=c]í>/ÚûeMÌE\n_õTG rÍjè}*hN4)57ÁàfSªRÎyCÂ#&?YQbóîW'x.9m{dÙù-K+â8Ê:\\éÃu0\"Ht,XÒwaã;ºÀ$úDáÇ´§vnP3°ILVipÔ6B@gÉ%ìZÕÓlFòÛ<êçAs`Jqz(",
        "[!eVêSR\"°Àva1z;ÕEÃlTZ+r:hPÉÌiBÛÇ@àAtÚQ%6d2L&´ÙãYô\nÂº03ÊÁùÎî$yóXs\\g§{>}p_GqN*bJ,áH<=8ìõíª.Fú('CD|ÔIc/f-é)#ÒÈ`Omèn¨ ?Uû7k4wÍKÓu9çW5]òâjMxo",
        "kêcbqç=AíépOõ\\xPÙd]j-ÛKGn,@Ã{`ìãUNhEF_yuBàV´eÔòûÉâZa\"§9}/.:Îo$DÈièùówª)z;ásRSÌ°7?Á2ÒvÀÂô'mgÊlQÇ3!JI(º<MXÚ%16|8Y¨5LÕ4[HC#î0W+fTúr\n&*t> ÍÓ"
    );

    private static int indexForAlphabet(String text)
    {
        int securityNumber = 50; //>2
        int index = 0;

        for (int c = 0; c < text.length(); c++)
        {
            char textChar = text.charAt(c);
            int charIndex = alphabet.indexOf(textChar);

            if (charIndex != -1)
                index += (charIndex + (c * charIndex)) * securityNumber;
        }

        return index % (alphabet.length() - 1);
    }

    public static String encrypt(String message, String key)
    {
        String response = "";
        int index = indexForAlphabet(key);
        int currentAlphabet = (index + key.length()) % (encryptedAlphabets.size() - 1);

        for (char c: message.toCharArray())
        {
            int encryptVar = index % key.length();
            encryptVar = encryptedAlphabets.get(currentAlphabet).charAt(encryptVar);

            index = (index + encryptedAlphabets.get(currentAlphabet).indexOf(c) + encryptVar) % (alphabet.length() - 1);
            response = response.concat(String.valueOf(encryptedAlphabets.get(currentAlphabet).charAt(index)));

            currentAlphabet = (currentAlphabet + 1) % (encryptedAlphabets.size() - 1);
        }

        return response;
    }

    public static String decrypt(String message, String key)
    {
        String response = "";
        int index = indexForAlphabet(key);
        int currentAlphabet = (index + key.length()) % (encryptedAlphabets.size() - 1);

        for (char c: message.toCharArray())
        {
            int encryptVar = index % key.length();
            encryptVar = encryptedAlphabets.get(currentAlphabet).charAt(encryptVar);

            int indexTrue = (encryptedAlphabets.get(currentAlphabet).indexOf(c) - index - encryptVar);
            while (indexTrue < 0) indexTrue += (alphabet.length() - 1);
            char charTrue = encryptedAlphabets.get(currentAlphabet).charAt(indexTrue);

            index = (index + encryptedAlphabets.get(currentAlphabet).indexOf(charTrue) + encryptVar) % (alphabet.length() - 1);
            response = response.concat(String.valueOf(charTrue));

            currentAlphabet = (currentAlphabet + 1) % (encryptedAlphabets.size() - 1);
        }

        return response;
    }
}
