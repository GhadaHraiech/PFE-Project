/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ghadamira;


import java.awt.Dimension;
    import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


   
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.swing.JScrollPane;
import java.io.BufferedReader;
import java.io.FileReader;

 public class connexion
{

    public  PreparedStatement ps,ps1,ps2,ps3,ps4;

      lemmatisation lem=new lemmatisation();
   public void index()
    {try
       {  Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/pfe2", "root","");  java.sql.Statement st=cn.createStatement();
FileReader file = new FileReader("c:\\pfe\\pfe.txt"); //(s'il est dans le ficher de ton projet
BufferedReader r = new BufferedReader(file);


ArrayList<String> l = new ArrayList<>();
     l.add("this");
     l.add("so");
     l.add("goodness");
     l.add("oh");
     l.add("man");
     l.add("woman");
     l.add("omg");
     l.add("wow");
         l.add("better");
         l.add("around");
         l.add("before");
             l.add("after");
           l.add("a");
           l.add("and");
             l.add("you");
        l.add("rip");
        l.add("god");
        l.add("bless");
      
        l.add("actually");
        l.add("thank");
        l.add("damn");
        l.add("yep");
         l.add("the");
         l.add("is");
         l.add("are");
         l.add("i");
          l.add("gotta");
          l.add("next");
         l.add("they");
         l.add("she");
         l.add("She");
         l.add("he");
           l.add("lot");
               l.add("He");
                l.add("it");
           l.add("how");
           l.add("because");
           l.add("like");
                l.add("when");
                l.add("where");
                l.add("who");
                l.add("there");
                l.add("have");
                l.add("has");
                l.add("for");
                l.add("at");
                l.add("by");
              l.add("in");
                l.add("on");
                l.add("of");
            l.add("to");
                l.add("too");
                l.add("as");
                l.add("with");
               l.add("which");
                l.add("one");
                l.add("her");
                l.add("his");
                l.add("not");
                l.add("can");
              l.add("even");
                l.add("all");
               l.add("me");
                l.add("do");
                l.add("don't");
                l.add("from");
                l.add("their");
                l.add("no");
                l.add("yes");
                l.add("good");
                l.add("well");
                l.add("that");
                l.add("who");
                l.add("first");
                l.add("second");
                l.add("last");
                l.add("hi");
               l.add("hello");
                l.add("since");
                l.add("was");
                l.add("were");
                l.add("please");
                l.add("little");
                l.add("big");
                l.add("my");
                l.add("your");
                l.add("so");
                l.add("most");
                l.add("do");
                l.add("does");
               l.add("recently");
                   l.add("already");
                    l.add("soon");
                    l.add("im");
                    l.add("us");
    l.add("what");
    l.add("each");
    l.add("through");
      l.add("am");
        l.add("will");
          l.add("used");
            l.add("really");
             l.add("someone");
              l.add("something");
               l.add("an");
                l.add("whenever");
                  l.add("wherever");
                   l.add("now");
                    l.add("later");
                     l.add("lot");
                      l.add("from");
                       l.add("enough");
                        l.add("we");
                        l.add("u");
                        l.add("two");
                        l.add("up");
                        l.add("m");
                        l.add("believe");
                        l.add("never");
                        l.add("lol");
                        l.add("ever");
                        l.add("else");
                        l.add("may");
                        l.add("these");
                        l.add("crazy");
                        l.add("some");
                        l.add("thing");
                        l.add("mr");
                        l.add("cant");
                        l.add("may");
                        l.add("should");
                        l.add("young");
                        l.add("old");
                        l.add("must");
                        l.add("need");
                        l.add("over");
                        l.add("else");
                        l.add("if");
            l.add("mine");
            l.add("our");
            l.add("had");
               l.add("end");
               l.add("its");
               l.add("having");
                l.add("doesn");
                 l.add("would");
                  l.add("anyway");
                   l.add("anyways");
                   l.add("could");
                   l.add("just");
                   l.add("about");
                   l.add("make");
                   l.add("made");
                   l.add("much");
                   l.add("more");
                   l.add("put");
                  l.add(" please");
                   l.add("like");
                    l.add("also");
                     l.add("keep");
                      l.add("but");
                       l.add("while");
                        l.add("get");
                         l.add("year");
                          l.add("get");
                           l.add("exact");
                            l.add("him");
                             l.add("don");
                             l.add("easy");
                             l.add("maybe");
                             l.add("why");
                             l.add("out");
                             l.add("yeah");
                             l.add("be");
                             l.add("many");
                             l.add("much");
                             l.add("great");
                            l.add("did");
                            l.add("new");
                    l.add("re");
                    l.add("ll");
                    l.add("s");
                    l.add("t");
                     l.add("d");
                      l.add("ve");
String line = r.readLine();
 int v=0;
 String lemat="";
 String value="";
            int n=0;
            double d=0; 
      int b=0;
      int z=1;
    int a=0;
    String y="";
int i;
while (line != null) {
    i=0;
      ArrayList<String> lsmv = new ArrayList<String>();
     Map<String, Integer> h1 = new HashMap<>();
      Map<String, Integer> h2 = new HashMap<>();
    String ch1="";
  
    a++;
    y=line; 
 System.out.println(y);
while(i<y.length())
 {char q=y.charAt(i);
 v=q;
    if((v!=58)&&(v!=59)&&(v!=46)&&(v!=44)&&(v!=38)&&(v!=35)&&(v!=33)&&(v!=34)&&(v!=64)&&(v!=63)&&(v!=40)&&(v!=41)&&(v!=45))
     {
    ch1=ch1+q; 
     }
    i++;
 }
String[] decompose = ch1.split(" ");
    int h=0;
  String t="";
   for (h=0;h<decompose.length;h++) {
      
       decompose[h]=decompose[h].toLowerCase();
       
       lsmv.add( decompose[h]);
      
       }  
lsmv.removeAll(l);
      Iterator<String> iter = lsmv.iterator();
     while (iter.hasNext()) {
    value = iter.next();
    lemat=lem.stripAffixes(value);
     
           Integer currentCount = h1.get(lemat);
            if (currentCount == null) {
                currentCount = 0;
            }
            ++currentCount;
            h1.put(lemat, n);
            h2.put(lemat,currentCount );
        }
      for (Entry<String, Integer> compt : h2.entrySet()) {
                              int w=0;
                              int x=0;
  String req="INSERT INTO `index`(`ID`, `contenu`, `frequence`, `idf`, `score`) VALUES ("+a+",'"+compt.getKey()+"',"+compt.getValue()+","+w+","+x+")";
                            
              st.executeUpdate(req);}
        // calcul idf et n
    int hh=getNbtweet();
    for (Entry<String, Integer> entry : h1.entrySet()) {
         int p=0;  
        ps= cn.prepareStatement("SELECT COUNT(*) FROM terme WHERE contenu=?");
      	ps.setString(1, entry.getKey());
           ResultSet Rs=ps.executeQuery();
		if(Rs.next())
                        {  b= Rs.getInt(1);
                           if(b==0)
                        {d=Math.log10(hh/z);
            String req1="insert into terme (contenu,idf,N)VALUES('"+entry.getKey()+"',"+d+","+z+")";
            
              st.executeUpdate(req1);
                        } else
                           { 
                          ps2= cn.prepareStatement("SELECT N FROM terme WHERE contenu=?");  
                         ps2.setString(1, entry.getKey());
                         ResultSet rs=ps2.executeQuery();
			if(rs.next())
                        {  p= rs.getInt("N");
                    p++;
                  d=Math.log10(hh/p);
                   ps1= cn.prepareStatement("Update terme Set idf=?  Where contenu=?");
                    ps1.setDouble(1,d);
			ps1.setString(2,entry.getKey());
                        ps1.executeUpdate();
                        ps3= cn.prepareStatement("Update terme Set N=?  Where contenu=?");
       
			ps3.setDouble(1,p);
			ps3.setString(2,entry.getKey());
                        ps3.executeUpdate();}}
            }}
                      
            //insertion idf dans index
ResultSet bs=st.executeQuery("SELECT * FROM `terme`   ");
 
    double o;
while(bs.next()){ String aa=bs.getString("contenu");
                            o=bs.getDouble("idf");
                             ps4= cn.prepareStatement("Update `index` Set idf=?  Where contenu=?");
                          ps4.setDouble(1,o);
			ps4.setString(2,aa);
                        ps4.executeUpdate();}
        //calcul score
        ResultSet ks=st.executeQuery("SELECT * FROM `index`   ");
 double ll;
  int gg,bb;
  double cc;
while(ks.next()){ bb=ks.getInt("IDin");
                            gg=ks.getInt("frequence");
                            ll=ks.getDouble("idf");
                             cc=ll*gg;
                                     ps4= cn.prepareStatement("Update `index` Set score=?  Where IDin=?");
                           ps4.setDouble(1,cc);
			ps4.setInt(2,bb);
                        ps4.executeUpdate();   
                        } line = r.readLine();
}

r.close();
    } catch(Exception e1){
			System.out.println("indexation :"+e1);
   }
    
    }
   
   public  int getNbtweet(){
		
       int i=0;
       try{
                    Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/pfe2", "root","");
         
            
           ps= cn.prepareStatement("SELECT COUNT(*) FROM document ");
          
			
			
			ResultSet rs=ps.executeQuery();
		
			if(rs.next())
                        {
				i=rs.getInt(1);
                        }
			
		}
                
                
		catch(Exception e1){
			System.out.println("getNbDocuments:"+e1);
		}
	
               return i;

	}
 

 public void modelvecto(String d)
 {
 
 
 String i;
 double k=0;
  double w;
   int j=0;
 
        HashMap<String, Integer> h3 = new HashMap<>();
       
           try{
         Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/pfe2", "root","");
         
            
             
            java.sql.Statement st=cn.createStatement();
        
           h3=indexation_req(d);
   
   
        
                   
            
 ResultSet rs=st.executeQuery("select * from document ");
 while(rs.next())
                        {  w=0;
                            
                  
                            j =  rs.getInt("ID");
   
       for (Entry<String, Integer> entry : h3.entrySet()) {
           
                      PreparedStatement  ps= cn.prepareStatement("select * from `index` WHERE ID=?");
           ps.setInt(1,j);
           
          ResultSet Rs= ps.executeQuery();
      while(Rs.next())    
      { 
        
           String a=Rs.getString("contenu");
           
          
          
            i=Rs.getString("score");
            
         
         k=Double.parseDouble(i);
             
          if(entry.getKey().equals(a))
                {
                    
                   w+=entry.getValue()*k;
                     
                }
         
           
                      
    
      
        
      
   
      
            
  }
              double l=calculQi(d);
      double r=calculsomscore();
      double y=Math.sqrt(l)*Math.sqrt(r);
      double z=w/y;
  
    
             java.sql.Statement st2=cn.createStatement();
                 
            ps= cn.prepareStatement("Update document Set mv=? Where ID=?");
          
			
			ps.setDouble(1,z);
			ps.setInt(2,j);
                        ps.executeUpdate();}}
     
		}catch(Exception e1){
			System.out.println("Connection failed - calcul model vecto :"+e1);
		}
        }
 public HashMap<String,Integer> indexation_req( String t){

    
    String ch1="";
 int i=0;

while(i<t.length())
 {

     char c=t.charAt(i);
     
      int v=c;
     
     if((v!=58)&&(v!=59)&&(v!=46)&&(v!=44))
     {
       
      ch1=ch1+c;   
     }
     
     i++;
 }

    
  HashMap<String, Integer> ghada = new HashMap<>();

        // Compter chaque mot
  
        String[] words = ch1.split(" ");
          ArrayList<String> tweet = new ArrayList<String>();
          int h;
   for (h=0;h<words.length;h++) {
      words[h]=words[h].toLowerCase();
        String vv=lem.stripAffixes(words[h]);
  
       tweet.add(vv);
       System.out.println(tweet);
       }  
         ArrayList<String> l = new ArrayList<>();
         
         l.add("this");
     l.add("so");
     l.add("goodness");
     l.add("oh");
     l.add("man");
     l.add("woman");
     l.add("omg");
     l.add("wow");
         l.add("better");
         l.add("around");
         l.add("before");
             l.add("after");
           l.add("a");
           l.add("and");
             l.add("you");
        l.add("rip");
        l.add("god");
        l.add("bless");
        l.add("wouldn't");
        l.add("actually");
        l.add("thank");
        l.add("damn");
        l.add("yep");
         l.add("the");
         l.add("is");
         l.add("are");
         l.add("i");
          l.add("gotta");
          l.add("next");
         l.add("they");
         l.add("she");
         l.add("She");
         l.add("he");
           l.add("lot");
               l.add("He");
                l.add("it");
           l.add("how");
           l.add("because");
           l.add("like");
                l.add("when");
                l.add("where");
                l.add("who");
                l.add("there");
                l.add("have");
                l.add("has");
                l.add("for");
                l.add("at");
                l.add("by");
              l.add("in");
                l.add("on");
                l.add("of");
            l.add("to");
                l.add("too");
                l.add("as");
                l.add("with");
               l.add("which");
                l.add("one");
                l.add("her");
                l.add("his");
                l.add("not");
                l.add("can");
                l.add("can't");
               l.add("it's");
                l.add("even");
                l.add("all");
               l.add("me");
                l.add("do");
                l.add("don't");
                l.add("from");
                l.add("their");
                l.add("no");
                l.add("yes");
                l.add("good");
                l.add("well");
                l.add("that");
                l.add("who");
                l.add("first");
                l.add("second");
                l.add("last");
                l.add("hi");
               l.add("hello");
                l.add("since");
                l.add("was");
                l.add("were");
                l.add("please");
                l.add("little");
                l.add("big");
                l.add("my");
                l.add("your");
                l.add("so");
                l.add("most");
                l.add("do");
                l.add("does");
               l.add("recently");
                   l.add("already");
                    l.add("soon");
                    l.add("im");
                    l.add("us");
    l.add("what");
    l.add("each");
    l.add("through");
      l.add("am");
        l.add("will");
          l.add("used");
            l.add("really");
             l.add("someone");
              l.add("something");
               l.add("an");
                l.add("whenever");
                  l.add("wherever");
                   l.add("now");
                    l.add("later");
                     l.add("lot");
                      l.add("from");
                       l.add("enough");
                        l.add("we");
            l.add("mine");
            l.add("our");
            l.add("had");
               l.add("end");
               l.add("its");
               l.add("having");
                l.add("doesn");
                 l.add("would");
                  l.add("anyway");
                   l.add("anyways");
                   l.add("could");
                   l.add("just");
                   l.add("about");
                   l.add("make");
                   l.add("made");
                   l.add("much");
                   l.add("more");
                   l.add("put");
                  l.add(" please");
                   l.add("like");
                    l.add("also");
                     l.add("keep");
                      l.add("but");
                       l.add("while");
                        l.add("get");
                         l.add("year");
                          l.add("get");
                           l.add("exact");
                            l.add("him");
                             l.add("don");
                             l.add("easy");
                             l.add("maybe");
                             l.add("why");
                             l.add("out");
                             l.add("yeah");
                             l.add("be");
                             l.add("many");
                             l.add("much");
                             l.add("great");
                            l.add("did");
                    l.add("re");
                    l.add("ll");
                    l.add("s");
                    l.add("t");
                     l.add("d");
                      l.add("ve");

    // use add() method to add values in the list
  
tweet.removeAll(l);
        
      Iterator<String> iter = tweet.iterator();

 
     

     while (iter.hasNext()) {
    
     String value = iter.next();
    
  
        
            Integer currentCount = ghada.get(value);
            if (currentCount == null) {
                currentCount = 0;
            }

            ++currentCount;
            ghada.put(value, currentCount);
               
        }

        // Obtenir la list en ordre
   return ghada;

  }
   
   
    //PS: Je suis très flemmard et je trouve ce code vachement moche, bref un code fait en 10s
public double calculQi(String g)

{ 
    double  x,s=0;
HashMap<String,Integer> mira= new HashMap();
mira=indexation_req(g);

         for (Entry<String, Integer> entry : mira.entrySet()) {
            
              x=entry.getValue().doubleValue();
            
              s+=Math.pow(x, 2);
         }
         

return s;
}
public double calculsomscore()

{  
    String l="";
    double som=0;
    double v=0;
    try{
                    Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/pfe2", "root","");
         
            
             
            java.sql.Statement st=cn.createStatement();
            
 ResultSet rs=st.executeQuery("select * from `index` ");
 
    
while(rs.next())
                        {
                           
                     l=rs.getString("score");
                        v=Double.parseDouble(l);
                        som+=Math.pow(v, 2);
                        }
        
                }catch(Exception e1){
			System.out.println(e1);
		}
 
     return som;  
}

/*void viderterme()
{
    


try {
     Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/projetpfe", "root","");
		 java.sql.Statement st2=cn.createStatement();
                 
            ps= cn.prepareStatement("TRUNCATE terme");
			int i=ps.executeUpdate();
                        
		
		}catch(Exception e){
			System.out.println("erreur connection - viderIndex : " +e );
		}

}*/
/*void updatetweet()
{
    
String c="";
int p=0;

try {
     Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/pfe3", "root","");
		 java.sql.Statement st2=cn.createStatement();
                  
            java.sql.Statement st=cn.createStatement();
            
 ResultSet rs=st.executeQuery("SELECT * FROM `document`   ");
 
    
while(rs.next())
                        {
                  c=rs.getString("ID");
                  p=Integer.parseInt(c);
                  
            ps= cn.prepareStatement("Update document Set mv=0 Where ID=?");
            ps.setInt(1,p);
			int i=ps.executeUpdate();
                        
		
                        }}catch(Exception e){
			System.out.println("erreur connection - update tweet : " +e );
		}

}*/
 }