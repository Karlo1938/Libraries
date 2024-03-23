<?php 
    function removeExtraSpaces($text){
        $words = str_split($text);
        $space = false;
            $a="";
            for ($i= 0;$i<count($words);$i++){
                  if ($words[$i]!=" "){
                        $space=false; 
                        $a = $a.$words[$i];
                  }
                  else if ($words[$i]==" "&&$space==false){
                        $a = $a." ";
                        $space=true;
                  }
            }
            return $a;
    }
?>