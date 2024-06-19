import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { BaseListCtl } from 'src/app/base-list.component';
import { ServiceLocatorService } from 'src/app/service-locator.service';

@Component({
  selector: 'app-pmbmlist',
  templateUrl: './pmbmlist.component.html',
  styleUrls: ['./pmbmlist.component.css']
})
export class PmbmlistComponent extends BaseListCtl {

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
    super(locator.endpoints.PMBM, locator, route);
  }

}
