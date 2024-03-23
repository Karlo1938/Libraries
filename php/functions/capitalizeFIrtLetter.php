<?php
    function capitalizeFirstLetter($text){
        $words=explode(" ", $text);
        foreach($words as &$word){ //&es para referenciar a la variable
              $word = ucfirst($word);
              
        }
        return implode(" ", $words);
    }
?>