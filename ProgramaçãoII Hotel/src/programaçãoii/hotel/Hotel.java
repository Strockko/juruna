
package programaçãoii.hotel;


public class Hotel {
String nome, loc,dia;
Float diaria,dia2;
Integer telefone,ano,dia3;
// NOME
void atribuirnome ( String valor){
    nome = valor;
}

String returnenome (){
    return nome;
}

// LOCALIZAÇÂO

void atribuirloc (String valor){
    loc = valor;
}
String retorneloc (){
    return loc;
}

// VALOR DA DIARIA

void atribuirvalor (Float valor){
    diaria = valor;
}
Float retornevalor (){
    return diaria;
}

// TELEFONE

void atribuirtelefone (Integer valor){
    telefone  = valor;
}
Integer retornetelefone (){
    return telefone;
}

// Ano de fundação

void atribuirano (Integer valor){
    ano = valor;
}

Integer retorneano (){
    return ano;
}

Float preco (String valor){
    dia=valor;
    dia2 = Float.parseFloat (dia);
    if (dia2 <= 6){
        return diaria *dia2;
    }else if (dia2 <= 10){
    return (diaria * dia2)-((diaria * 10 )/100);
        
    }else {
        return (diaria *dia2) - ((diaria * 30)/100);
        
    }
}

}


