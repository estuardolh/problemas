package main

import (
"os"
"fmt"
"io/ioutil"
)


func main() {
  here := os.Args[0]
  file_name := os.Args[1]
  
  b, err := ioutil.ReadFile(file_name) // just pass the file name
  if err != nil {
    fmt.Print(err)
  }

  fmt.Println(b) // print the content as 'bytes'

  str := string(b) // convert content to a 'string'

  fmt.Println(str) // print the content as a 'string'
}
