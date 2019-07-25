import { Injectable } from '@angular/core';
 
import { HttpClient } from '@angular/common/http';
 
import 'rxjs/add/operator/map';
 
import 'rxjs/add/operator/catch';
 
import { Observable } from 'rxjs/Observable';
 

 
@Injectable()
export class AppService {
  constructor(private http: HttpClient) { }
 
insertQuarter(): Observable<any> {
  try {
    return this.http.get('http://localhost:8080/insertQuarter') .map(res=>res) ;
  }catch (error) { 
    console.log(error);
  }  
}

 
removeQuarter(): Observable<any> {
  try {
    return this.http.get('http://localhost:8080/removeQuarter') .map(res=>res) ;
  }catch (error) { 
    console.log(error);
  }  
}

 
pushButton(): Observable<any> {
  try {
    return this.http.get('http://localhost:8080/pushButton').map(res=>res) ;
  }catch (error) { 
    console.log(error);
  }  
}

 
currentInventoryCount(): Observable<any> {
  try {
    return this.http.get('http://localhost:8080/currentInventoryCount') .map(res=>res) ;
  }catch (error) { 
    console.log(error);
  }  
}

}
