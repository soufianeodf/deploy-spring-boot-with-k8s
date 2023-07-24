import { Component } from '@angular/core';
import { GreetingService } from './service/greeting.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.sass']
})
export class AppComponent {

  constructor(private GreetingService: GreetingService) {
  }

  title: String = "";

  ngOnInit() {
    this.GreetingService.getGreeting().subscribe((data: any) => {
      this.title = data.message;
    });
  }
}
