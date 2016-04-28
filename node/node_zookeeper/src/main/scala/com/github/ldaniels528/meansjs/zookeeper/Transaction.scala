package com.github.ldaniels528.meansjs.zookeeper

import com.github.ldaniels528.meansjs.nodejs.buffer.Buffer
import com.github.ldaniels528.meansjs.util.ScalaJsHelper._

import scala.concurrent.ExecutionContext
import scala.scalajs.js

/**
  * Zookeeper Transaction
  * @author lawrence.daniels@gmail.com
  */
@js.native
trait Transaction extends js.Object {

  /**
    * Add a check (existence) operation with given path and optional version.
    * @example check(path, [version]): Transaction
    */
  def check(path: String, version: Int): this.type = js.native

  /**
    * Add a check (existence) operation with given path and optional version.
    * @example check(path, [version]): Transaction
    */
  def check(path: String): this.type = js.native

  /**
    * Execute the transaction atomically.
    * @example commit(callback): void
    */
  def commit(callback: js.Function): Unit = js.native

  /**
    * Add a create operation with given path, data, acls and mode.
    * @example create(path, [data], [acls], [mode]): Transaction
    */
  def create(path: String, data: Buffer, acls: js.Array[ACL], mode: CreateMode): this.type = js.native

  /**
    * Add a create operation with given path, data, acls and mode.
    * @example create(path, [data], [acls], [mode]): Transaction
    */
  def create(path: String, data: Buffer, acls: js.Array[ACL]): this.type = js.native

  /**
    * Add a create operation with given path, data, acls and mode.
    * @example create(path, [data], [acls], [mode]): Transaction
    */
  def create(path: String, data: Buffer): this.type = js.native

  /**
    * Add a create operation with given path, data, acls and mode.
    * @example create(path, [data], [acls], [mode]): Transaction
    */
  def create(path: String): this.type = js.native

  /**
    * Add a delete operation with the given path and optional version.
    * @example remove(path, data, [version]): Transaction
    */
  def remove(path: String, version: Int): this.type = js.native

  /**
    * Add a delete operation with the given path and optional version.
    * @example remove(path, data, [version]): Transaction
    */
  def remove(path: String): this.type = js.native

  /**
    * Add a set-data operation with the given path, data and optional version.
    * @example setData(path, data, [version]): Transaction
    */
  def setData(path: String, data: Buffer, version: Int): this.type = js.native

  /**
    * Add a set-data operation with the given path, data and optional version.
    * @example setData(path, data, [version]): Transaction
    */
  def setData(path: String, data: Buffer): this.type = js.native

}

/**
  * Transaction Companion
  * @author lawrence.daniels@gmail.com
  */
object Transaction {

  /**
    * Transaction Extensions
    * @author lawrence.daniels@gmail.com
    */
  implicit class TransactionExtensions(val transaction: Transaction) extends AnyVal {

    /**
      * @see [[Transaction.commit()]]
      */
    @inline
    def commitAsync()(implicit ec: ExecutionContext) = callbackWithErrorToFuture[js.Any](transaction.commit)

  }

}