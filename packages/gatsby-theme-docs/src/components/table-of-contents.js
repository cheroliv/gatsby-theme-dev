/** @jsx jsx */
import { jsx } from "theme-ui"
import { graphql, Link, useStaticQuery } from "gatsby"

const TableOfContents = () => {
  const { allDocsPage: { nodes: pages } } = useStaticQuery(graphql`
    query {
      allDocsPage {
        nodes {
          id
          title
          path
        }
      }
    }
  `)
  return (
    <div>
      <h2>Explore the Docs</h2>
      <ul>
        {pages.map(({ id, path, title }) => (
          <li key={id}>
            <Link
              to={path}
              sx={{
                "&.active": {
                  fontStyle: "italic",
                  textDecoration: "none",
                  "::after": { content: "\" (currently viewing)\"" }
                }
              }}
              activeClassName="active">{title}</Link>
          </li>
        ))}
      </ul>
    </div>
  )
}

export default TableOfContents
