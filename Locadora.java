public class Locadora {
 
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(1,"José","123.456.789-15","11/05/1985",05);
         
        Cliente cliente2 = new Cliente(2, "Renata","987.654.312.22","23/07/1970",03);;
         
        Cliente cliente3 = new Cliente(3, "Roberto","112.658.985-75","15/03/1997",07 );
 
        Cliente cliente4 = new Cliente(4, "João","524.658.784-99", "01/05/1987", 04);

        Cliente cliente5 = new Cliente(5,"Clarice","125.678.984-78", "21/08/1995",02);

        Filme filme1 = new Filme(1,"cara, cade meu carro?", 5,"18/09/1995", "Após uma noite de loucuras, dois amigos não conseguem se lembrar de nada, inclusive onde estacionaram o carro", "22/10/2019", 2);
        
        Filme filme2 = new Filme(2,"Peixe grande e suas histórias maravilhosas", 1, "11/02/1989", "Mesmo no leito de morte, Edward narra histórias fantásticas. Quando William, que é um jornalista, começa a investigar os contos de seu pai, ele começa a entender o homem e sua mania de contar histórias.", "15/06/2019", 5);

        Filme filme3 = new Filme(3, "Senhor Ninguém", 3,"19/06/1995", "Nemo, de 118 anos, conta a história de sua vida a um repórter. Na maior parte do tempo ele pensa que tem 34 anos, mas tudo fica confuso ao se concentrar em sua verdadeira idade", "10/10/2019", 2 );

        Filme filme4 = new Filme(4,"O Labirinto do Fauno", 6, "Em 1944, na Espanha, a jovem Ofélia e sua mãe doente chegam ao posto do novo marido de sua mãe, um sádico oficial do exército que está tentando reprimir uma guerrilheira.", "11/07/2019", 3);

        Filme filme5 = new Filme(5,"Os oito odiados", 4,"16/02/1992", "Em busca de abrigo para se proteger de uma nevasca, dois caçadores de recompensas, um prisioneiro e um homem que alega ser xerife conhecem quatro estranhos.", "06/12/2018", 4);

        Filme filme6 = new Filme(6,"Tempo de Violência", 6,"Um pistoleiro se apaixona pela mulher de seu chefe, um boxeador não se sai bem em uma luta e um casal tenta executar um plano de roubo que foge do controle.", "sinopse", "23/10/2019", 7);

        Filme filme7 = new Filme(7, "Campo do Medo",3,"10/08/2019", "Dois irmãos são surpreendidos após escutarem pedidos de socorro vindos do interior de um matagal no Kansas. Eles decidem atender os chamados de ajuda e entram no local. No entanto, logo descobrem que uma vez lá dentro é impossível sair.", "20/10/2019", 9);

        Filme filme8 = new Filme(8, "Jogo Perigoso", 7, "25/10/2017","Jessie e Gerald formam um casal em crise. Para salvar o casamento, eles decidem viajar a uma casa isolada, na intenção de passar um fim de semana romântico. O marido leva algemas e decide prender a esposa a cama. Ela hesita a participar do jogo erótico, mas aceita. No entanto, uma vez presa, o marido sofre um ataque cardíaco e morre", "25/10/2019", 8);

        Filme filme9 = new Filme(9, "Eli", 5, "21/04/2017", "Eli está sendo submetido a um tratamento para sua doença que é rara e auto-imune e acaba descobrindo que a clínica em que está internado não é tão segura como pensava. ", "11/09/2019",3);
    
        Filme filme10 = new Filme(10, "Cães de Aluguel", 6, "10/10/1987", "Criminoso reúne seis bandidos para grande roubo de diamantes. Algo sai errado e um deles é ferido durante roubo e os bandidos precisam descobrir quem foi que os traiu, o que gera enorme tensão no grupo e enfraquece a todos.", "25/10/2019", 10);
        
        Locacao locacao1 = new Locacao(1, cliente1, "21/10/2019", "23/10/2019");

        Locacao locacao2 = new Locacao(2, cliente1, "05/10/2019", "10/10/2019");

        Locacao locacao3 = new Locacao(3, cliente3, "01/10/2019", "03/10/2019");

        Locacao locacao4 = new Locacao(4, cliente4, "03/10/2019", "06/10/2019");

        Locacao locacao5 = new Locacao(5, cliente5, "23/10/2019", "26/10/2019");

        FilmeLocado locadoFilme1 = new FilmeLocado(10, filme1);

        FilmeLocado locadoFilme2 = new FilmeLocado(8, filme2);

        FilmeLocado locadoFilme3 = new FilmeLocado(5, filme3);

        FilmeLocado locadoFilme4 = new FilmeLocado(7, filme6);

        FilmeLocado locadoFilme5 = new FilmeLocado(4, filme8);
    
    }

 
}
