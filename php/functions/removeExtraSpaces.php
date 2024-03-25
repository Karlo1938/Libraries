<?php 


      //El primer parametro es el texto, en este texto se removeran aquellos espacios adicionales que pueden sobrevenir de un formulario html.//
    function removeExtraSpaces($text){
        $words = str_split($text);
        $space = false;
            $formatting="";
            for ($i= 0;$i<count($words);$i++){
                  if ($words[$i]!=" "){
                        $space=false; 
                        $formatting = $formatting.$words[$i];
                  }
                  else if ($words[$i]==" "&&$space==false){
                        $formatting = $formatting." ";
                        $space=true;
                  }
            }
            return $formatting;
    }
?>