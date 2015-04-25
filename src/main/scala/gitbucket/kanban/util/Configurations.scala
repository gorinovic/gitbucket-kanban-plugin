package gitbucket.gist.util

object Configurations {
  lazy val KanbanRepoDir = s"${gitbucket.core.util.Directory.GitBucketHome}/kanban"
  lazy val Limit = 10
}
