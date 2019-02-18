package com.socgen.usecase.model

import com.socgen.usecase.modeltrait.ModelTrait

//3,4,5,129
case class Auth(val aua:String ,val sa:String ,val asa:String , val res_state_name:String ) extends ModelTrait{
  override def toString():String={
    aua +" | "+sa+" | "+asa+" | "+res_state_name
  }
}