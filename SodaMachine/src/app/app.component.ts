import { Component } from '@angular/core';
import {AppService} from './app.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Soda Machine App';
  message ="";
  constructor(public appService : AppService ){

  }
  
  insertQuarter(){
    this.appService.insertQuarter().subscribe(res=>{
      this.message = "Quarter is inserted";
    });
  }
  removeQuarter(){
    this.appService.removeQuarter().subscribe(res=>{
      this.message = "Quarter is removed";
    });
  }
  pushButton(){
    this.appService.pushButton().subscribe(res=>{
      this.message = res;
    });
  }

  currentInventoryCount(){
    this.appService.currentInventoryCount().subscribe(res=>{
      let count = res == null ? 0:res ;
      this.message = "Available Soda Count = " + count;
    });
  }
}
