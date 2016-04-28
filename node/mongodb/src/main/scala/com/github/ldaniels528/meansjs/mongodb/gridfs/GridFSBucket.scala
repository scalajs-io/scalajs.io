package com.github.ldaniels528.meansjs.mongodb.gridfs

import com.github.ldaniels528.meansjs.nodejs.stream._

import scala.scalajs.js

/**
  * GridFS Bucket
  * @author lawrence.daniels@gmail.com
  */
@js.native
trait GridFSBucket extends js.Object {

  /**
    * Deletes a file with the given id
    * @param id the id of the file doc
    * @example delete(id, callback)
    */
  def delete(id: js.Any, callback: js.Function): Unit = js.native

  /**
    * Deletes a file with the given id
    * @param id the id of the file doc
    * @example delete(id, callback)
    */
  def delete(id: js.Any): Unit = js.native

  /**
    * Removes this bucket's files collection, followed by its chunks collection.
    * @example drop(callback)
    */
  def drop(callback: js.Function): Unit = js.native

  /**
    * Removes this bucket's files collection, followed by its chunks collection.
    * @example drop(callback)
    */
  def drop(): Unit = js.native

  /**
    * Convenience wrapper around find on the files collection
    * @example find(filter, options)
    */
  def find(filter: js.Any, options: GridFSBucketFindOptions): Unit = js.native

  /**
    * Returns a readable stream (GridFSBucketReadStream) for streaming file data from GridFS.
    * @param id      the id of the file doc
    * @param options optional settings (default is null)
    * @example openDownloadStream(id, options)
    */
  def openDownloadStream(id: js.Any, options: DownloadStreamOptions = null): GridFSBucketReadStream = js.native

  /**
    * Returns a readable stream (GridFSBucketReadStream) for streaming the file with the given name from GridFS.
    * If there are multiple files with the same name, this will stream the most recent file with the given name
    * (as determined by the uploadDate field). You can set the revision option to change this behavior.
    * @example bucket.openDownloadStreamByName('meistersinger.mp3')
    */
  def openDownloadStreamByName(file: String, options: DownloadStreamByNameOptions = null): Readable = js.native

  /**
    * Returns a writable stream (GridFSBucketWriteStream) for writing buffers to GridFS. The stream's 'id' property
    * contains the resulting file's id.
    * @example bucket.openUploadStream('./meistersinger.mp3')
    */
  def openUploadStream(file: String, options: UploadStreamOptions = null): Writable = js.native

}

