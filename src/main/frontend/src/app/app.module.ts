import { NgModule } from '@angular/core';
import { TaskService } from './tasks/task.service';
import {HttpClient, HttpClientModule} from "@angular/common/http";
import {BrowserModule} from "@angular/platform-browser";
import {AppComponent} from "./app.component";


@NgModule({
  declarations: [
  ],
  imports: [
    HttpClientModule,
    BrowserModule
  ],
  providers: [
    TaskService,
    HttpClient
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
